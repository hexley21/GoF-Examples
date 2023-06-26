package org.hxl.proxy.video_host.source;

import org.hxl.proxy.video_host.VideoHost;

public class VideoHostNetwork implements VideoHost {
    final private static String LINK = "https://youtube.com/";

    private void requestVideo(String link, String address) {
        System.out.println("The video's is playing from website " + link + address);
    }
    @Override
    public boolean watchVideo(String address) {
        requestVideo(LINK, address);
        return true;
    }
}
