package com.devesta.i5course.designpattern.structural.proxy.caching;

public class Main {
    public static void main(String[] args) {
        VideoDownloader downloader = new ProxyVideoDownloader();
        downloader.getVideo("test");
        downloader.getVideo("test");
        downloader.getVideo("test2");
        downloader.getVideo("test3");
        downloader.getVideo("test2");
    }
}
