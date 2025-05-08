package design.pattern.structural.proxy;

// Real Object: Loads and displays an image
public class RealImage implements Image{
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();  // Expensive operation
    }

    private void loadFromDisk() {
        System.out.println("Loading image from disk: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
