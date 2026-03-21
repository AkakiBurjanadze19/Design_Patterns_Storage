package Structural.Bridge.EntertainmentSystem;

public class Usage {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        BasicRemote basicRemote = new BasicRemote(radio);
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);

        basicRemote.togglePower();
        basicRemote.mute();
        advancedRemote.voiceControl("Open YouTube");

        System.out.println(radio.getVolume());

        tv.setVolume(50);
        System.out.println(tv.getVolume());
    }
}
