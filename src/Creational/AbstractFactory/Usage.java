package Creational.AbstractFactory;

public class Usage {
    public static void main(String[] args) {
        GUIFactory linuxFactory = new LinuxFactory();
        GUIFactory windowsFactory = new WindowsFactory();
        GUIFactory macFactory = new MacFactory();

        Application linuxApp = new Application(linuxFactory);
        Application windowsApp = new Application(windowsFactory);
        Application macApp = new Application(macFactory);

        Application[] apps = {linuxApp, windowsApp, macApp};

        for (Application app : apps) {
            app.render();
            System.out.println();
        }
    }
}
