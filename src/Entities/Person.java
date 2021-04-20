package Entities;

import Utilities.PhoneNumber;

import java.util.*;
/**
 *
 * @author Ian Cazabal Villada
 * @author Jose Maria Garcia Ramirez
 * @author Fani Michel Izquierdo Sosa
 * @author Erick Jesus Mota Oaxaca
 * @author Ricardo Rito Anguiano
 */
public abstract class Person {
    protected String name;
    protected String lastname;
    public List<PhoneNumber> phoneNumbers = new ArrayList<>();

    /**
     * Metodo que muestra los numeros de telefono de una persona
     */
    public void showNumbers() {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            System.out.print(i + " ");
            System.out.println(phoneNumbers.get(i));

        }

    }
    /**
     * Este metodo realiza la función de añadir un numero telefonico
     * del objeto persona
     * @param phoneNumber
     */
    public void addNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
        System.out.println("Numero añadido");

    }

    /**
     * Metodo encargado de remover un numero de telefono de la clase persona
     * @return Regresa una cadena de texto confirmando que el numero fue removido
     */
    public String removeNumber() {
        showNumbers();

        Scanner input = new Scanner(System.in);
        System.out.print("Que numero quieres borrar?: ");

        int i = input.nextInt();

        var dataNumber = phoneNumbers.get(i);
        phoneNumbers.remove(i);

        return "El numero %s ha sido removido".formatted(dataNumber);
    }

    /**
     * Metodo constructor parametrizado
     * @param name
     * @param lastname
     */
    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Person(String name, String lastname, PhoneNumber phoneNumber) {
        this.name = name;
        this.lastname = lastname;
        this.phoneNumbers.add(phoneNumber);
    }
    /**
     * Metodo que regresa una cadena de texto con el nombre de una
     * persona registrada en el sistema
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * Metodo encargado de asignar un nombre al objeto persona
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Metodo que realiza la funcion de regresar el apellido de una
     * persona registrada en el sistema
     * @return
     */
    public String getLastname() {
        return this.lastname;
    }
    /**
     * Metodo que se encarga de asignar el apellido de una persona
     * registrada
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //
    public abstract String show();
}
