package Behavioral.Template.DataMining;

public class JSONProcessor extends DataProcessor {
    @Override
    public void extractData() {
        System.out.println("Reading JSON stream and identifying keys...");
    }

    @Override
    public void parseData() {
        System.out.println("Mapping JSON records to Java objects...");
    }
}