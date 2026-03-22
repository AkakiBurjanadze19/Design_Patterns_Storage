package Structural.Proxy;

import java.net.Proxy;

public class GameMenu {
    public static void main(String[] args) {
        MapImage map1 = new ProxyMapImage("Level_1_Jungle.png");
        MapImage map2 = new ProxyMapImage("Level_2_Desert.png");
        MapImage map3 = new ProxyMapImage("Level_3_Space.png");

        System.out.println("Menu is finally ready!");

        map1.display();
    }
}