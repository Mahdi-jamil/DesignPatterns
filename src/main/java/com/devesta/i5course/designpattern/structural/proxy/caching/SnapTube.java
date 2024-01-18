package com.devesta.i5course.designpattern.structural.proxy.caching;

public class SnapTube implements VideoDownloader {
    @Override
    public Video getVideo(String videoName) {
        System.out.println("connecting to server");
        System.out.println("downloading " + videoName);
        return new Video();
    }
}
