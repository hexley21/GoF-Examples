package org.hxl.proxy;

import org.hxl.proxy.video_host.VideoHostProxy;

public class Main {
    public static void main(String[] args) {
        VideoHostProxy proxy = new VideoHostProxy();
        String address = "watch?v=dQw4w9WgXcQ";
        proxy.watchVideo(address);
        System.out.println();
        System.out.println("After some time...");
        System.out.println();
        proxy.watchVideo(address);
    }
}