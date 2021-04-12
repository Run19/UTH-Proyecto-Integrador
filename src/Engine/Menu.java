package Engine;
import Entities.Client;
import Entities.Employee;
import Entities.EmployeeType;
import Time.Date;
import Utilities.Order;
import Utilities.PhoneNumber;
import Utilities.ServiceType;
import Utilities.Shift;

import java.util.*;
public class Menu {


    public void showMenu(){
        Employee e1 = new Employee("Jose", "Garcia", EmployeeType.programmer, 500,
                new Date(25,9,2015), Shift.morning);
        Client c1 = new Client("Ricardo","Rito",1,new PhoneNumber(227,5635243,
                "Movistar"),
                new Date(25,7,1999));
        Order order = new Order(123,c1,e1,"CONTRATACION",ServiceType.InternetPlusPhone);
        Administrator administrator = new Administrator();

        int op;
        Scanner input = new Scanner(System.in);
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
            switch (op){
                case 1 -> {
                    System.out.println(administrator.addClient(c1));
                }

                case 2 -> {
                    administrator.addOrder(order);


                }
                case 3 -> {
                    System.out.println("*********************************");
                    System.out.println( administrator.contractEmployee(e1));
                    System.out.println("*********************************");
                }
                case 4 -> {
                    administrator.fireEmploye();
                }
                case 5 -> {
                    administrator.removeOrder();
                    System.out.println("Se ha removido la orden");
                }
                case 6 -> {
                    System.out.println("ORDENES CREADAS");
                    administrator.showOrders();
                }
                case 7 -> {
                    System.out.println("EMPLEADOS");
                   administrator.showStaff();

                }
                case 8 -> {
                    System.out.println("CLIENTES");
                    administrator.showClients();
                }
                case 9 -> {
                    System.out.println("SALIR");
                }
                default -> {
                    System.out.println("Usa una opcion valida");
                }



            }
        }while (op < 9);



    }
}
