package Entities;

import Utilities.PhoneNumber;

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
        System.out.println("Numero añadido");

    }

    public String removeNumber() {
        showNumbers();

        Scanner input = new Scanner(System.in);
        System.out.print("Que numero quieres borrar?: ");

        int i = input.nextInt();

        var dataNumber = phoneNumbers.get(i);
        phoneNumbers.remove(i);

        return "El numero %s ha sido removido".formatted(dataNumber);
    }


    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name, String lastname, PhoneNumber phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.phoneNumbers.add(phoneNumber);
    }


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

    //
    public abstract String show();
}
