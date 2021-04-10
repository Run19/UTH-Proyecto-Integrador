public class TestPerson {
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber(221, 5380878, "Telcel");
        PhoneNumber p2 = new PhoneNumber(227, 1035217, "Movistar");
        Date d1 = new Date(25, 9, 2002);


        Client c1 = new Client("Juan", "Amaro", 100003, new PhoneNumber(522, 6441234, "Movistar"), d1);
        System.out.println(c1.show());
        System.out.println("--------------------------------------------------------------------------------------------");
        c1.addNumber(new PhoneNumber(744, 5436745, "Verizon"));
        System.out.println(c1.show());
        System.out.println("--------------------------------------------------------------------------------------------");
        c1.addNumber(p1);
        System.out.println(c1.show());
        System.out.println("--------------------------------------------------------------------------------------------");
        c1.addNumber(p2);
        System.out.println(c1.show());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(c1.removeNumber());


    }
}
