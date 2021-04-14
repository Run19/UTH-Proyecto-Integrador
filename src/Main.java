import Engine.Administrator;
import Engine.Menu;
import Entities.Client;
import Entities.Employee;
import RandomDataGenerator.DataGenerator;
import Time.Date;
import Utilities.PhoneNumber;


public class Main {
    public static void main(String[] args) {
        awake();
        ClearConsole();
        Menu menu = new Menu();
        System.out.println("\t\t InteRun el internet mas rapido del oeste");
        menu.showMenu();
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
