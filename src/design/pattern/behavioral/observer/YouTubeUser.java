package design.pattern.behavioral.observer;

// Concrete Observer: YouTube User
public class YouTubeUser implements Subscriber{
    private final String name;

    public YouTubeUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received notification: New video uploaded - " + videoTitle);
    }
}
