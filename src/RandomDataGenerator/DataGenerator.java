package RandomDataGenerator;


import Entities.EmployeeType;
import Utilities.Shift;

public class DataGenerator {
    private static final String[] names = new String[]{"Juanito", "Pedrin", "Chema", "Fani la mas hermosa",
            "El macflai", "Run Run", "El chuys", "Oskr", "La otako"};
    private static final String[] companies = new String[]{"Ei ti an ti", "Movistar1", "Telcel", "Pillofon"};
    private static final String[] lastNames = new String[]{"Lopez", "Perez", "Rito", "Garcia",
            "Dorantes", "Run", "Derecho", "Ramirez", "Aguilar", "kawasaki", "De la losa"
            , "Colon", "Juarez", "Miyasaki", "Jaegger", "Ackerman"};


    public static String getRandonName() {
        var randomNum = random(0, names.length);
        return names[randomNum];
    }

    public static String getRandomLastName() {
        var randomNum = random(0, lastNames.length);
        return lastNames[randomNum];
    }

    public static String getRandomCompany() {
        var randomNum = random(0, companies.length);
        return companies[randomNum];
    }


    public static int random(int min, int max) {
        return (int) (Math.random() * max) + min;
    }

    public static EmployeeType getRandomTypeEmployeeType() {
        var randomNum = (int) (Math.random() * EmployeeType.values().length);
        for (EmployeeType type : EmployeeType.values()) {
            if (type.ordinal() == randomNum) {
                return type;
            }
        }
        return EmployeeType.maintenance;
    }

    public static Shift getRandomShift() {
        var randomNum = (int) (Math.random() * Shift.values().length);
        for (Shift type : Shift.values()) {
            if (type.ordinal() == randomNum) {
                return type;
            }
        }
        return Shift.morning;
    }

}
