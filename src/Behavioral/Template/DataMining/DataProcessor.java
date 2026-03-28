package Behavioral.Template.DataMining;

public abstract class DataProcessor {
    public final void process(String filename) {
        openFile(filename);
        extractData();
        parseData();
        closeFile(filename);
        System.out.println("--- process complete ---");
    }

    public void openFile(String filename) {
        System.out.println("Opening file: " + filename);
    }

    public void closeFile(String filename) {
        System.out.println("Closing file: " + filename);
    }

    public abstract void extractData();
    public abstract void parseData();
}