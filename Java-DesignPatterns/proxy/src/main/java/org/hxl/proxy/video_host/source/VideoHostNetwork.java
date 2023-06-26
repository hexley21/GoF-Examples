package org.hxl.proxy.video_host.source;

import org.hxl.proxy.video_host.VideoHost;

/**
 * The VideoHostNetwork class implements the VideoHost interface. It represents the network component responsible for
 * fetching and playing videos from a remote source.
 */
public class VideoHostNetwork implements VideoHost {
    private static final String LINK = "https://youtube.com/";

    /**
     * Simulates the request to play a video from a remote network source.
     *
     * @param link    The base link or URL of the video host.
     * @param address The address or identifier of the video.
     */
    private void requestVideo(String link, String address) {
        System.out.println("The video is playing from the website " + link + address);
    }

    /**
     * Implements the watchVideo method of the VideoHost interface. It requests the video from the network
     * by invoking the requestVideo method with the appropriate link and address.
     *
     * @param address The address or identifier of the video.
     * @return true to indicate successful playback.
     */
    @Override
    public boolean watchVideo(String address) {
        requestVideo(LINK, address);
        return true;
    }
}