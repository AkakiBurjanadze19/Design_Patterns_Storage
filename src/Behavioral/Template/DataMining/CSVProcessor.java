package Behavioral.Template.DataMining;

public class CSVProcessor extends DataProcessor {
    @Override
    public void extractData() {
        System.out.println("Extracting rows and columns from CSV...");
    }

    @Override
    public void parseData() {
        System.out.println("Parsing CSV strings into domain objects...");
    }
}
