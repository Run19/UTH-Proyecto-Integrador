import java.util.*;

//CHEMA
public abstract class Person {
    protected String name;
    protected String lastname;
    public List<PhoneNumber> phoneNumbers = new ArrayList<>();


    public void showNumbers() {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.print(i + " ");
            System.out.println(phoneNumbers.get(i));

        }

    }

    public void addNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
        System.out.println("Numero aniadido");

    }

    public String removeNumber() {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.print(i + ") ");
            System.out.println(phoneNumbers.get(i));

        }
        Scanner input = new Scanner(System.in);
        System.out.print("Que numero quieres borrar?: ");
        int i = input.nextInt();

        phoneNumbers.remove(i);

        System.out.println("Ahora tus numeros son: ");
        showNumbers();

        return "";
    }


    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }


    public abstract String showProperties();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
