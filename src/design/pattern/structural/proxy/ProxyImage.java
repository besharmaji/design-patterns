package design.pattern.structural.proxy;

public class ProxyImage implements Image{
    private RealImage realImage;
    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Load only when needed
        }else{
            System.out.println("Loading image from cache: " + fileName);
        }
        realImage.display();
    }
}
