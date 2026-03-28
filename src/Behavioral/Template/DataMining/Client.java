package Behavioral.Template.DataMining;

public class Client {
    public static void main(String[] args) {
        CSVProcessor csvProcessor = new CSVProcessor();
        csvProcessor.process("users.csv");

        System.out.println();

        JSONProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.process("users.json");
    }
}