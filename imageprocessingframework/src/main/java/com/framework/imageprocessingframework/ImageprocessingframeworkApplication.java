package com.framework.imageprocessingframework;

import com.framework.imageprocessingframework.compress.Compress;
import com.framework.imageprocessingframework.compress.CompressChild1;
import com.framework.imageprocessingframework.compress.CompressChild2;
import com.framework.imageprocessingframework.filter.Filter;
import com.framework.imageprocessingframework.filter.FilterImpl1;
import com.framework.imageprocessingframework.filter.FilterImpl2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ImageprocessingframeworkApplication {


    public static  void showImage(int []image)
    {
        System.out.println("\n");
        for(int i=0;i<image.length;i++){
            System.out.print(image[i]+" ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        ApplicationContext context=new
            ClassPathXmlApplicationContext("IOConfiguration.xml");
        Filter filter1= (FilterImpl1) context.getBean("filter1");
        Filter filter2= (FilterImpl2) context.getBean("filter2");

        Compress compress1= (CompressChild1) context.getBean("compress1");
        Compress compress2= (CompressChild2) context.getBean("compress2");

        Framework framework=Framework.getInstance();
        framework.setFilter(filter1);

        int[] image=new int[10];
        System.out.println("----------------------my image:-------------------------");

        for(int i=0;i<image.length;i++){
            image[i]=i*i;
            System.out.print(image[i]+" ");

        }

        System.out.println("\n-------------------filtered image:-------------------------\n");
        int[] filtredImage1=framework.getFilter().filter(image);
        showImage(filtredImage1);

        framework.setFilter(filter2);
        int[] filtredImage2=framework.getFilter().filter(image);
        showImage(filtredImage2);
        System.out.println("\n-------------------Compresse image:-------------------------\n");

        framework.setCompress(compress1);
        int[] compressedImage1=framework.getCompress().compresser(image);
        showImage(compressedImage1);
        System.out.println("\n--------------------------------------------\n");

        framework.setCompress(compress2);
        int[] compressedImage2=framework.getCompress().compresser(image);
        showImage(compressedImage2);


    }

}
