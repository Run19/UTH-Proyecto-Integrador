package Engine;

import Entities.Administrator;
import Entities.Client;
import Entities.Employee;
import Entities.EmployeeType;
import RandomDataGenerator.DataGenerator;
import Time.Date;
import Util.Util;
import Utilities.Order;
import Utilities.PhoneNumber;
import Utilities.ServiceType;
import Utilities.Shift;

import java.util.Scanner;

public class ConsoleEngine {
    static Scanner input = new Scanner(System.in);
    static Administrator administrator = Administrator.singleInstance();

    public static void start() {
        GenerateDummyData();
        System.out.println(Util.drawTitle('-', "Sky Net"));
        Menu.showMenu();
    }

    public static void cancelService() {
        System.out.println("Selecciona el cliente de quien quieres cancelar el servicio");
        System.out.println(Administrator.singleInstance().showClients());
        int clientToCancel = input.nextInt() - 1;


        var currentServ = Administrator.singleInstance().getClients().get(clientToCancel).getServices();
        if (currentServ.size() > 0) {
            System.out.println("Elija el servicio a cancelar");

            for (int i = 1; i <= currentServ.size(); i++) {
                System.out.printf("%d.- %s%n", i, currentServ.get(i - 1).getServiceData());
            }
            var servToDelete = input.nextInt() - 1;
            System.out.println(Administrator.singleInstance().getClients().get(clientToCancel).removeService(currentServ.get(servToDelete)));
        } else {
            System.out.println("El cliente no cuenta con servicios");
        }

    }

    public static void addClient() {
        System.out.println("\tAÑADIR CLIENTE");

        System.out.println("Escribe el nombre: ");
        var name = input.next();

        System.out.println("Escribe el apellido: ");
        var lastName = input.next();

        System.out.println("NUMERO DE TELEFONO");

        System.out.println("Escribe la lada: ");
        var lade = input.nextInt();

        System.out.println("Escribe el numero: ");
        var num = input.nextInt();

        System.out.println("Escribe la companiia: ");
        var company = input.next();

        System.out.println("FECHA DE ALTA");

        System.out.println("Escribe el dia: ");
        var day = input.nextInt();

        System.out.println("Escriba el mes: ");
        var month = input.nextInt();

        System.out.println("Escriba el anio: ");
        var year = input.nextInt();

        System.out.println(administrator.addClient(new Client(name, lastName, new PhoneNumber(lade, num, company),
                new Date(day, month, year))));
    }

    public static void showClients() {
        System.out.println(administrator.showClients());
    }


    public static void addOrder() {
        System.out.println(administrator.showClients());
        System.out.println("Selecciona el cliente: ");
        var cliente = input.nextInt();
        var numC = cliente - 1;
        var client = administrator.clients.get(numC);
        System.out.println("Descripcion de la orden");
        var descript = input.next();
        System.out.println("\tSERVICIO");

        System.out.println("Seleccione el tipo de servicio");

        var opc = input.nextInt();

        ServiceType type = ServiceType.values()[opc - 1];
        System.out.println(administrator.addOrder(new Order(client, descript, type)));
    }

    private static void showServices() {

        for (int i = 1; i <= ServiceType.values().length; i++) {
            System.out.printf("%d.- %s\n", i, ServiceType.values()[i - 1].getServiceData());
        }

    }

    public static void showOrders() {
        System.out.println(administrator.showOrders());
    }

    public static void contractEmployee() {
        System.out.println("Escribe el nombre: ");
        var name = input.next();

        System.out.println("Escribe el apellido: ");
        var lastName = input.next();


        System.out.println("1.- " + EmployeeType.programmer);
        System.out.println("2.- " + EmployeeType.administrator);
        System.out.println("3.- " + EmployeeType.maintenance);
        System.out.println("Seleccione tipo de empleado: ");
        var op = input.nextInt();
        EmployeeType type = null;
        if (op == 1) {
            type = EmployeeType.programmer;
        } else if (op == 2) {
            type = EmployeeType.administrator;
        } else if (op == 3) {
            type = EmployeeType.maintenance;
        } else {
            System.out.println("Escribe una opcion valida");
        }
        System.out.println("Introduce el salario: ");
        var salary = input.nextFloat();

        System.out.println("FECA DE CONTRATACION");
        System.out.println("Escribe el dia: ");
        var day = input.nextInt();

        System.out.println("Escriba el mes: ");
        var month = input.nextInt();

        System.out.println("Escriba el anio: ");
        var year = input.nextInt();
        System.out.println("Turno: ");
        System.out.println("1.- " + Shift.morning);
        System.out.println("2.- " + Shift.afteernoon);
        System.out.println("3.- " + Shift.night);
        System.out.println("Seleccione el turno");
        var opc = input.nextInt();
        Shift turno = null;
        if (opc == 1) {
            turno = Shift.morning;
        } else if (opc == 2) {
            turno = Shift.afteernoon;
        } else if (opc == 3) {
            turno = Shift.night;
        } else {
            System.out.println("Seleccione una opcion valida");
        }


        System.out.println(administrator.contractEmployee(new Employee(name, lastName, type, salary, new Date(day, month, year), turno)));
    }

    public static void showStaff() {
        System.out.println(administrator.showStaff());
    }

    public static void fireEmployee() {
        input = new Scanner(System.in);
        for (int i = 0; i < Administrator.singleInstance().getStaff().size(); i++) {
            int num = i + 1;
            System.out.println(num + ")" + Administrator.singleInstance().getStaff().get(i).getName());
        }
        System.out.println("Que empleado quieres remover?");
        int op = input.nextInt();
        op = op - 1;
        System.out.println(administrator.fireEmploye(op));
    }

    public static void removeOrder() {
        System.out.println(Administrator.singleInstance().showOrders());
        System.out.println("Que orden quieres remover?");
        int opc = input.nextInt();
        opc = opc - 1;
        System.out.println(administrator.removeOrder(opc));
    }

    public static void contractService() {
        System.out.println("Elija el cliente que contratara el servicio");
        showClients();
        int user = input.nextInt();
        System.out.println("Elija el servicio a contratar");
        showServices();
        int service = input.nextInt();

        System.out.println(administrator.provideService(administrator.getClients().get(user - 1)
                , ServiceType.values()[service - 1]));

    }


    private static void GenerateDummyData() {
        for (int i = 0; i < 10; i++) {
            var currentClientName = DataGenerator.getRandonName();
            var currentClientLast = DataGenerator.getRandomLastName();
            var currentPhone = new PhoneNumber(DataGenerator.random(100, 999), DataGenerator.random(100, 999), DataGenerator.getRandomCompany());
            Administrator.singleInstance().addClient(new Client(currentClientName, currentClientLast, currentPhone,
                    Date.RandomDate(2010, 2021)));
        }
        for (int i = 0; i < 10; i++) {
            var currentClientName = DataGenerator.getRandonName();
            var currentClientLast = DataGenerator.getRandomLastName();
            var currentPhone = new PhoneNumber(DataGenerator.random(100, 999), DataGenerator.random(100, 999), DataGenerator.getRandomCompany());


            Administrator.singleInstance().contractEmployee(new Employee(currentClientName, currentClientLast, currentPhone,
                    DataGenerator.getRandomTypeEmployeeType(), DataGenerator.random(4500, 22000),
                    Date.RandomDate(2010, 2021), DataGenerator.getRandomShift()));
        }
    }

}

