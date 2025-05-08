package design.pattern.behavioral.observer;

public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create a YouTube channel
        YouTubeChannel channel = new YouTubeChannel("India Travels");

        // Create subscribers
        Subscriber user1 = new YouTubeUser("John");
        Subscriber user2 = new YouTubeUser("Amit");
        Subscriber user3 = new YouTubeUser("Priya");

        // Users subscribe to the channel
        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        // Upload a new video (All subscribers will be notified)
        channel.uploadVideo("Top 10 Places to Visit in Thailand!");

        // Priya unsubscribes
        channel.unsubscribe(user3);

        // Upload another video (Only John and Amit will be notified)
        channel.uploadVideo("Best Street Food in Bangkok!");
    }
}

/*🤔 Why Use Observer Pattern?
✅ Decouples objects → YouTubeChannel (Subject) doesn’t directly depend on YouTubeUsers (Observers).
✅ Flexible → New observers can join/leave anytime without modifying existing code.
✅ Real-time notifications → When something changes, all subscribers get notified immediately.

💡 Simple Rule: If one object needs to notify multiple objects about a change, Observer Pattern is the best fit! 🚀
* */