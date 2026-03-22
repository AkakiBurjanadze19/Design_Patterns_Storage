package Structural.Proxy;

public class ProxyMapImage implements MapImage {
    private RealMapImage realMapImage;
    private String fileName;

    public ProxyMapImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realMapImage == null) {
            realMapImage = new RealMapImage(fileName);
        }

        realMapImage.display();
    }
}
