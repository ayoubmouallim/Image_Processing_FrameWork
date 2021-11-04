package com.framework.imageprocessingframework.filter;

import com.framework.imageprocessingframework.filter.Filter;

public class FilterImpl2 implements Filter {
    @Override
    public int[] filter(int[] data) {
        int[] filteredImage =data;
        for (int i = 0; i <data.length ; i++) {
            filteredImage[i] = data[i]*3;
        }
        System.out.println("******************filter image using imple 2******************");

        return  filteredImage;    }
}
