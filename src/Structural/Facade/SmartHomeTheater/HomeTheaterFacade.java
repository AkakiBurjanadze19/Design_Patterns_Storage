package Structural.Facade.SmartHomeTheater;

public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private StreamingService stream;
    private SmartLights lights;

    public HomeTheaterFacade(TV tv, SoundSystem sound, StreamingService stream, SmartLights lights) {
        this.tv = tv;
        this.sound = sound;
        this.stream = stream;
        this.lights = lights;
    }

    public void watchMovie(String movieName) {
        System.out.println("--- Getting ready to watch a movie ---");
        lights.dim(20);
        tv.on();
        tv.setInput("HDMI 1");
        sound.on();
        sound.setVolume(15);
        sound.setSurroundSound();
        stream.login();
        stream.searchMovie(movieName);
        stream.playMovie(movieName);
    }

    public void endMovie() {
        System.out.println("--- Shutting down theater ---");
        lights.brighten();
        tv.off();
        sound.off();
    }
}