package com.framework.imageprocessingframework.filter;

public class FilterDefaultImpl implements  Filter{

    @Override
    public int[] filter(int[] data) {
             int[] filteredImage =data;
        for (int i = 0; i <data.length ; i++) {
            filteredImage[i] = data[i]*2;
        }
        System.out.println("******************filter image using default imple ******************");


        return  filteredImage;
    }
}
