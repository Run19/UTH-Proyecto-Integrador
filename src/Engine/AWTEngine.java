package Engine;

import GUI.Window;

public class AWTEngine {

    private static void start() {
    }

    private static void mainWindows() {
        Window mainWindow = new Window(500, 500);<
        mainWindow.setVisible(true);
    }


    public static void main(String[] args) {
        start();
    }

}
