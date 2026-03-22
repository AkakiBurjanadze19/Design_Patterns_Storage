package Structural.Facade.SmartHomeTheater;

public class StreamingService {
    public void login() {
        System.out.println("Logged into movie service.");
    }

    public void searchMovie(String movie) {
        System.out.println("Searching for: " + movie);
    }

    public void playMovie(String movie) {
        System.out.println("Now playing movie: " + movie);
    }
}
