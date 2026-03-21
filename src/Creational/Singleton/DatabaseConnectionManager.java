package Creational.Singleton;

public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {}

    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }

        return instance;
    }

    public void connect() {
        String connectionUrl = "https://www.some_db.com/1231";
        System.out.println("Connected to database: " + connectionUrl);
    }
}