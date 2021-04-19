package Engine;

import java.util.Scanner;

public class Menu {
    static Scanner input = new Scanner(System.in);
    //Contratar empleados, proveer servicios y generar ordenes


    public static void showMenu() {
        int op;

        do {
            System.out.println("1-. Añadir cliente");
            System.out.println("2.- Crear una orden");
            System.out.println("3.- Contratar servicio");
            System.out.println("4.- Cancelar servicio");
            System.out.println("5.- Contratar empelado");
            System.out.println("6.- Remover empleado");
            System.out.println("7.- Remover Orden");
            System.out.println("8.- Ver Ordenes creadas");
            System.out.println("9.- Ver Empleados");
            System.out.println("10.- Ver Clientes");
            System.out.println("0.- SALIR");
            System.out.print("Selecciona una opcion: ");
            op = input.nextInt();

            switch (op) {
                case 1 -> ConsoleEngine.addClient();

                case 2 -> ConsoleEngine.addOrder();
                case 3 -> ConsoleEngine.contractService();
                case 4 -> ConsoleEngine.cancelService();
                case 5 -> ConsoleEngine.contractEmployee();
                case 6 -> ConsoleEngine.fireEmployee();
                case 7 -> ConsoleEngine.removeOrder();
                case 8 -> {
                    System.out.println("ORDENES CREADAS");
                    ConsoleEngine.showOrders();
                }
                case 9 -> {
                    System.out.println("EMPLEADOS");
                    ConsoleEngine.showStaff();
                }
                case 10 -> {
                    System.out.println("CLIENTES");
                    ConsoleEngine.showClients();
                }

                case 0 -> System.out.println("SALIR");
                default -> System.out.println("Usa una opcion valida");
            }
        } while (op != 0);
    }


}
