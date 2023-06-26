package org.hxl.proxy.video_host;

import org.hxl.proxy.video_host.source.VideoHostCache;
import org.hxl.proxy.video_host.source.VideoHostNetwork;

/**
 * The VideoHostProxy class acts as a proxy for the VideoHost interface. It provides an additional layer of
 * functionality by utilizing a VideoHostCache to cache videos and a VideoHostNetwork to fetch videos from the network.
 */
public class VideoHostProxy implements VideoHost {

    private final VideoHostNetwork network = new VideoHostNetwork();
    private final VideoHostCache cache = new VideoHostCache();

    /**
     * Implements the watchVideo method of the VideoHost interface. It first checks if the video is available
     * in the cache using the VideoHostCache object. If the video is found in the cache, it is played from the cache.
     * Otherwise, it fetches the video from the network using the VideoHostNetwork object, caches it, and then plays it.
     *
     * @param address The address or identifier of the video.
     * @return true if the video is successfully watched, false otherwise.
     */
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
