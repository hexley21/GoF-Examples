package org.hxl.proxy.video_host.source;

import org.hxl.proxy.video_host.VideoHost;

import java.util.ArrayList;
import java.util.List;

/**
 * The VideoHostCache class implements the VideoHost interface. It represents the cache component responsible for
 * storing and retrieving videos that have been previously watched or accessed.
 */
public class VideoHostCache implements VideoHost {

    private final List<String> cachedVideos = new ArrayList<>();

    /**
     * Adds the video with the specified address to the cache.
     *
     * @param address The address or identifier of the video to be cached.
     */
    public void cacheVideo(String address) {
        cachedVideos.add(address);
        System.out.println("Video with address: " + address + " has been cached");
    }

    /**
     * Implements the watchVideo method of the VideoHost interface. It checks if the video with the specified
     * address exists in the cache. If found, it plays the video from the cache. Otherwise, it indicates that
     * the video is not cached.
     *
     * @param address The address or identifier of the video.
     * @return true if the video is found in the cache and played, false otherwise.
     */
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