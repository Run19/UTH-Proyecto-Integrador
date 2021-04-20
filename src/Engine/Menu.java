package Engine;

import java.util.*;


/**
 * Clase creada para poder visualizar las funciones principales de nuestra aplicacion
 *
 * @author Ian Cazabal Villada
 * @author Jose Maria Garcia Ramirez
 * @author Fani Michel Izquierdo Sosa
 * @author Erick Jesus Mota Oaxaca
 * @author Ricardo Rito Anguiano
 */

public class Menu {
    Scanner input = new Scanner(System.in);

    Function actions = new Function();

    /**
     * Metodo en el que se valida la opción de entrada del usuario para asi poder
     * darle el resultado esperado, también se declaro un nuevo empleado, un cliente
     * y una orden nueva
     */

    public void showMenu() {
        int op;

        do {
            System.out.println("1-. ANIADIR CLIENTE");
            System.out.println("2.- CREAR UNA ORDEN");
            System.out.println("3.- CONTRATAR");
            System.out.println("4.- REMOVER EMPLEADO");
            System.out.println("5.- REMOVER ORDEN");
            System.out.println("6.- VER ORDENES CREADAS");
            System.out.println("7.- VER EMPLEADOS");
            System.out.println("8.- VER CLIENTES");
            System.out.println("9.- CONTRATAR SERVICIO");
            System.out.println("10.- ANADIR NUMERO DE TELEFONO A CLIENTE");
            System.out.println("11.- SALIR");
            System.out.print("Selecciona una opcion: ");
            op = input.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("ANADIR CLIENTE");
                    actions.addClient();
                }

                case 2 -> {
                    System.out.println("ANADIR ORDEN");
                    actions.addOrder();
                }
                case 3 -> {
                    System.out.println("CONTRATAR");
                    actions.contractEmployee();
                }
                case 4 -> {
                    System.out.println("REMOVER EMPLEADO");
                    actions.fireEmployee();
                }
                case 5 -> {
                    System.out.println("REMOVER ORDEN");
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
                    System.out.println("CONTRATAR SERVICIO");
                    System.out.println("Para contratar un servicio el cliente tiene que estar dado de alta");
                    actions.provideService();
                }
                case 10 -> {
                    System.out.println("ANADIR NUMERO DE TELEFONO A CLIENTE");
                    actions.addNumberClient();
                }
                case 11 -> {
                    System.out.println("ADIOS");
                }
                default -> {
                    System.out.println("Usa una opcion valida");
                }


            }
        } while (op < 11);

    }


}
