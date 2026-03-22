package Structural.Facade.SmartHomeTheater;

public class Usage {
    public static void main(String[] args) {
        TV tv = new TV();
        SmartLights lights = new SmartLights();
        SoundSystem sound = new SoundSystem();
        StreamingService streamingService = new StreamingService();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                tv,
                sound,
                streamingService,
                lights
        );

        homeTheaterFacade.watchMovie("Bronx Tale");
        System.out.println();
        homeTheaterFacade.endMovie();
    }
}
