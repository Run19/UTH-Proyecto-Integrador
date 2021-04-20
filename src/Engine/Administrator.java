package Engine;

import Entities.Client;
import Entities.Employee;
import Utilities.Order;
import Utilities.PhoneNumber;
import Utilities.ServiceType;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Esta clase solo puede ser modificada por el o los administradores, esta compuesta por listas que
 * almacenan los datos de Client,Employee y Order
 *
 * @author Ian Cazabal Villada
 * @author Jose Maria Garcia Ramirez
 * @author Fani Michel Izquierdo Sosa
 * @author Erick Jesus Mota Oaxaca
 * @author Ricardo Rito Anguiano
 */

public class Administrator {

    public List<Client> clients = new ArrayList<>();
    private List<Employee> staff = new ArrayList<>();
    public List<Order> orders = new ArrayList<>();

    /**
     * Metodo constructor que te permitira establecer los valores correspondientes a cada lista
     *
     * @param clients
     * @param staff
     * @param orders
     */
    public Administrator(List<Client> clients, List<Employee> staff, List<Order> orders) {
        this.clients = clients;
        this.staff = staff;
        this.orders = orders;
    }

    public Administrator() {
        List<Client> clients = new ArrayList<>();
        List<Employee> staff = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

    }

    /**
     * Metodo que muestra a los clientes registrados
     */
    public void showClients() {
        for (int i = 0; i < clients.size(); i++) {
            var num = i + 1;
            System.out.println(num + ")" + this.clients.get(i));

        }

    }

    /**
     * Metodo que muestra al personal de la empresa
     */
    public void showStaff() {
        for (int i = 0; i < staff.size(); i++) {
            int num = i + 1;
            System.out.println(num + ")" + staff.get(i));
        }
    }

    /**
     * Metodo que sirve para añadir un nuevo cliente
     *
     * @param c Cliente nuevo
     * @return regresa un String que indica el nombre del nuevo cliente
     */
    public void addClient(Client client) {
        this.clients.add(client);
        System.out.println("Se ha agregado correctamente");
    }

    public void removeClient(Client cliente) {
        this.clients.remove(cliente);

    }

    /**
     * Metodo que sirve para añadir una nueva orden
     *
     * @param order nueva Order
     */
    public void addOrder(Order order) {
        this.orders.add(order);

        System.out.println("Se ha creado la Orden");
    }

    /**
     * Metodo que sirve para mostrar las ordenes disponibles
     */
    public void showOrders() {
        for (int i = 0; i < orders.size(); i++) {
            var num = i + 1;
            System.out.println(num + ")" + this.orders.get(i));
        }
    }

    /**
     * Metodo que sirve para remover una orden
     */
    public void removeOrder() {
        Scanner input = new Scanner(System.in);
        showOrders();
        System.out.println("Que orden quieres remover?");
        int opc = input.nextInt();
        opc = opc - 1;
        orders.remove(opc);
        System.out.println("Se ha removido correctamente");


    }

    /*
     * Metodo que sirve para agregarle un numero de telefono al cliente
     */
    public void addNumberClient(Client client, PhoneNumber phone) {
        client.addNumber(phone);

    }


    /**
     * Metodo que sirve para agregarle un numero de telefono al cliente
     */
    public void provideService(Client client, ServiceType serviceType) {
        client.addService(serviceType);
        System.out.println("El servicio se ha aniadido");
    }

    /**
     * Metodo que sirve para registrar la contratacion de un empleado
     *
     * @param newEmployee nuevo empleado
     */
    public void contractEmployee(Employee newEmployee) {
        staff.add(newEmployee);
        System.out.printf("%s ha sido contratado%n", newEmployee.getName());
    }

    /**
     * Metodo que sirve para remover empleados de nuestra lista Employee
     */
    public void fireEmploye() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < staff.size(); i++) {
            int num = i + 1;
            System.out.println(num + ")" + staff.get(i));
        }
        System.out.println("Que empleado quieres remover?");
        int op = input.nextInt();
        op = op - 1;
        staff.remove(op);

        System.out.println("Se ha removido corrrectamente");


    }


    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
