package org.hxl.proxy.video_host.source;

import org.hxl.proxy.video_host.VideoHost;

import java.util.ArrayList;
import java.util.List;

public class VideoHostCache implements VideoHost {

    final private List<String> cachedVideos = new ArrayList<>();

    public void cacheVideo(String address) {
        cachedVideos.add(address);
        System.out.println("Video with address: " + address + " has been cached");
    }


    @Override
    public boolean watchVideo(String address) {
        if (cachedVideos.contains(address)) {
            System.out.println("The video with address: " + address + " is playing from the cache store");
            return true;
        }
        System.out.println("The video with address: " + address + " is not cached");
        return false;
    }
}
