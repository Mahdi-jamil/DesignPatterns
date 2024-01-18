package com.devesta.i5course.designpattern.structural.proxy.caching;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoDownloader implements VideoDownloader {
    SnapTube snapTube = new SnapTube();
    private final Map<String, Video> cachedVideos = new HashMap<>();

    @Override
    public Video getVideo(String videoName) {
        Video video = cachedVideos.get(videoName);
        if (video != null) {
            return video;
        }
        return cachedVideos.put(videoName, snapTube.getVideo(videoName));
    }
}
