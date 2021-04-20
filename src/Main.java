import Engine.Menu;


public class Main {


    public static void main(String[] args) {

        ClearConsole();
        Menu menu = new Menu();
        System.out.println("\t\t InteRun el internet mas rapido del oeste");
        menu.showMenu();
    }


    public static void ClearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
