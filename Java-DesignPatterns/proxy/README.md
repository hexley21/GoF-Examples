# Proxy Pattern

The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object to control its access and provide additional functionality. It allows us to add a layer of indirection between clients and the real object, which can be useful for various purposes such as controlling access, caching, and providing a simplified interface.

## General Explanation

The Proxy Pattern involves two main components: the Proxy and the Real Subject. The Proxy acts as a substitute for the Real Subject and provides a similar interface. It controls access to the Real Subject, performing additional operations if necessary, while keeping the client unaware of the underlying complexity.

## Advantages of using the Proxy Pattern

- **Controlled access:** The Proxy Pattern enables fine-grained control over the access to the Real Subject. It allows you to implement access restrictions, authentication, and other security measures.

- **Caching:** Proxies can cache results of expensive operations performed by the Real Subject. This can improve performance by avoiding redundant computations or network requests.

- **Simplified interface:** Proxies can provide a simplified interface to the clients, hiding the complexity of the Real Subject. This can be helpful when dealing with complex systems or APIs.

- **Lazy initialization:** Proxies can delay the creation or initialization of the Real Subject until it is actually needed. This can save resources and improve the startup time of an application.

## Use Cases

The Proxy Pattern is applicable in various scenarios, including:

- **Remote services:** Proxies can be used to interact with remote services or APIs, providing a local representation of the remote objects. This can include handling network communication, caching, and error handling.

- **Access control:** Proxies can enforce access control policies by restricting clients' access to certain operations or resources.

- **Caching:** Proxies can cache the results of expensive computations or data retrieval operations, reducing the overall processing time and improving system performance.

- **Lazy loading:** Proxies can be used for lazy loading of objects, especially when loading them upfront is costly or not immediately necessary.

## Example

Let's consider a simplified example of a video hosting platform. In our example code, we have three main components: `VideoHostProxy`, `VideoHostCache`, and `VideoHostNetwork`. The `VideoHostProxy` acts as a proxy for the `VideoHost` interface, which represents the functionality of watching videos.

The `VideoHostCache` caches videos that have been previously watched, while the `VideoHostNetwork` fetches and plays videos from a remote source. The `VideoHostProxy` checks if a video is available in the cache, and if so, it plays it from the cache. Otherwise, it fetches the video from the network, caches it, and then plays it.

This example demonstrates how the Proxy Pattern can be used to control access to video playback functionality, cache videos for faster retrieval, and provide a simplified interface to the client.

```java
// Usage example

// Create a video host proxy
VideoHost videoHost = new VideoHostProxy();

// Watch a video (first attempt)
boolean video1Result = videoHost.watchVideo("video1.mp4");
// Output: The video with address: video1.mp4 is not cached

// Watch a video (second attempt)
boolean video1CachedResult = videoHost.watchVideo("video1.mp4");
// Output: The video with address: video1.mp4 is playing from the cache store

// Watch another video
boolean video2Result = videoHost.watchVideo("video2.mp4");
// Output: The video's playing from the website https://youtube.com/video2.mp4
