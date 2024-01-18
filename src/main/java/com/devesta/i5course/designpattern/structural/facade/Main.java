package com.devesta.i5course.designpattern.structural.facade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        File mp4 = conversionFacade.convertVideo("test", ".mp4");
        System.out.println(mp4 != null ? mp4 : "no thing");
    }
}
