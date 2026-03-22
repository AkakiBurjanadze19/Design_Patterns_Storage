package Structural.Proxy;

public class RealMapImage implements MapImage {
    private String fileName;

    public RealMapImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println(">> SYSTEM: Loading heavy 4K map file: " + fileName + "...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(">> SYSTEM: Map " + fileName + " loaded into VRAM.");
    }

    @Override
    public void display() {
        System.out.println("Rendering the full-resolution map: " + fileName);
    }
}