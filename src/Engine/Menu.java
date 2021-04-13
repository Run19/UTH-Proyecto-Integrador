package Engine;

import java.util.*;

public class Menu {
    Scanner input = new Scanner(System.in);
    Function actions = new Function();

    public void showMenu() {
        int op;

        do {
            System.out.println("1-. ANADIR CLIENTE");
            System.out.println("2.- CREAR UNA ORDEN");
            System.out.println("3.- CONTRATAR");
            System.out.println("4.- REMOVER EMPLEADO");
            System.out.println("5.- REMOVER ORDEN");
            System.out.println("6.- VER ORDENES CREADAS");
            System.out.println("7.- VER EMPLEADOS");
            System.out.println("8.- VER CLIENTES");
            System.out.println("9.- SALIR");
            System.out.print("Selecciona una opcion: ");
            op = input.nextInt();

            switch (op) {
                case 1 -> {
                    actions.addClient();
               }

                case 2 -> {
                   actions.addOrder();
                }
                case 3 -> {
                    actions.contractEmployee();
                }
                case 4 -> {
                    actions.fireEmployee();
                }
                case 5 -> {
                    actions.removeOrder();

                }
                case 6 -> {
                    System.out.println("ORDENES CREADAS");
                    actions.showOrders();
                }
                case 7 -> {
                    System.out.println("EMPLEADOS");
                    actions.showStaff();

                }
                case 8 -> {
                    System.out.println("CLIENTES");
                    actions.showClients();
                }
                case 9 -> {
                    System.out.println("SALIR");
                }
                default -> {
                    System.out.println("Usa una opcion valida");
                }


            }
        } while (op < 9);


    }
}
