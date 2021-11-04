package com.framework.imageprocessingframework.compress;

public class CompressChild1 extends Compress{
    @Override
    public int[] compresser(int[] data) {
        System.out.println("compresse image using child 1");
        int[] compressedImage = new int [data.length/2];
        for (int i = 0; i < compressedImage.length; i++) {
            compressedImage[i] = data[i];
        }
        return compressedImage;
    }
}
