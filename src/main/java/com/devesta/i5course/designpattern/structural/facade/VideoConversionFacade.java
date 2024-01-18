package com.devesta.i5course.designpattern.structural.facade;

import java.io.File;

// Facade is an interface to use a complex system with conventional access to its methods
public class VideoConversionFacade {
    public File convertVideo(String videoName , String format){
        System.out.println("converting " + videoName);
        VideoFile file = new VideoFile();
        if(format.equals(".mp4")){
            new MPEG4CompressionCodec();
        }else{
            new OggCompressionCodec();
        }

        // some logic
        return new File("test");
    }
}
