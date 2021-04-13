import Engine.Administrator;
import Engine.Menu;
import Entities.Client;
import Entities.Employee;
import RandomDataGenerator.DataGenerator;
import Time.Date;
import Utilities.PhoneNumber;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        awake();
//        var Runtime = java.lang.Runtime.getRuntime();
//        Runtime.exec("cls");
        ClearConsole();


        Menu menu = new Menu();

//        Client cliente1 = new Client("Juan", "Ramirez", 1, new PhoneNumber(227,
//                5565432,"Movistar"),
//                new Date(12,9,2015));
//        System.out.println(cliente1.show());

        System.out.println("\t\t INTERUN");

        menu.showMenu();
//        Client c1 = new Client("Jose Maria", "GArcia Ramirez", new PhoneNumber(644,2278741,"Movistar"),
//                new Date(14,4,2021));
//        Client c2 = new Client(" Maria", " Ramirez", new PhoneNumber(644,2278741,"Movistar"),
//                new Date(14,4,2021));
//
//        Administrator admin = new Administrator();
//
//        admin.addClient(c1);
//        admin.addClient(c2);
//
//        admin.showClients();
//        PhoneNumber p1 = new PhoneNumber(221, 5380878, "Telcel");
//        PhoneNumber p2 = new PhoneNumber(227, 1035217, "Movistar");
//        Date d1 = new Date(25, 9, 2002);
//        Client c1 = new Client("Juan", "Amaro", 100003, new PhoneNumber(522,
//                6441234, "Movistar"), d1);
//
//        Employee juanitoPelengas = new Employee("Juanito", "Lopez", EmployeeType.programmer,
//                350, new Date(15, 8, 21), Shift.morning);
//        Administrator administrator = new Administrator();
//        System.out.println(administrator.contractEmployee(juanitoPelengas));
//        administrator.fireEmploye();

        //        System.out.println(c1.show());
//        System.out.println("--------------------------------------------------------------------------------------------");
//        c1.addNumber(new PhoneNumber(744, 5436745, "Verizon"));
//        System.out.println(c1.show());
//        System.out.println("--------------------------------------------------------------------------------------------");
//        c1.addNumber(p1);
//        System.out.println(c1.show());
//        System.out.println("--------------------------------------------------------------------------------------------");
//        c1.addNumber(p2);
//        System.out.println(c1.show());
//        System.out.println("--------------------------------------------------------------------------------------------");
//        System.out.println(c1.removeNumber());
//

    }

    /*Ejecutado al inicio del programa
     * Se encarga de inicializar los procesos necesarios para el funcionamiento correcto del programa
     * */
    public static void awake() {
        GenerateDummyData();

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


    public static void ClearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }


}
