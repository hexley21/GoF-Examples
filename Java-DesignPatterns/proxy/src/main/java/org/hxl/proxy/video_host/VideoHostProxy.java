package org.hxl.proxy.video_host;

import org.hxl.proxy.video_host.source.VideoHostCache;
import org.hxl.proxy.video_host.source.VideoHostNetwork;

public class VideoHostProxy implements VideoHost  {

    final private VideoHostNetwork network = new VideoHostNetwork();
    final private VideoHostCache cache = new VideoHostCache();

    @Override
    public boolean watchVideo(String address) {
        if (cache.watchVideo(address)) {
            return true;
        }
        boolean remote = network.watchVideo(address);
        cache.cacheVideo(address);
        return remote;
    }
}
