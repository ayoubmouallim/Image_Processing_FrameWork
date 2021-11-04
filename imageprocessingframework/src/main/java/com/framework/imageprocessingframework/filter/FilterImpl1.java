package com.framework.imageprocessingframework.filter;

public class FilterImpl1 implements Filter {
    @Override
    public int[] filter(int[] data) {
        int[] filteredImage = new int[data.length];
        for (int i = 0; i <data.length ; i++) {
            filteredImage[i] = data[i]*5;
        }
        System.out.println("******************filter image using imple 1******************");


        return  filteredImage;    }
}
