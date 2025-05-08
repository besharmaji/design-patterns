package design.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable) - YouTube Channel
public class YouTubeChannel {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private final String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    // Add a new subscriber
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("New subscriber added!");
    }

    // Remove a subscriber
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("A subscriber has unsubscribed.");
    }

    // Notify all subscribers about a new video
    public void uploadVideo(String videoTitle) {
        System.out.println("\n📢 " + channelName + " uploaded a new video: " + videoTitle);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }
}
