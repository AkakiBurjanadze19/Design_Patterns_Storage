package Creational.Singleton;

public class Usage {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
           DatabaseConnectionManager db = DatabaseConnectionManager.getInstance();
           db.connect();
        });

        Thread thread2 = new Thread(() -> {
            DatabaseConnectionManager db = DatabaseConnectionManager.getInstance();
            db.connect();
        });

        thread1.start();
        thread2.start();
    }
}
