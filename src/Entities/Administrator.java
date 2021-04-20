/*
 * Esta clase solo puede ser modificada por el o los administradores, esta compuesta por listas que
 * almacenan los datos de Client,Employee y Order
 * @author Ian Cazabal Villada
 * @author Jose Maria Garcia Ramirez
 * @author Fani Michel Izquierdo Sosa
 * @author Erick Jesus Mota Oaxaca
 * @author Ricardo Rito Anguiano
 */

package Entities;

import Utilities.Order;
import Utilities.ServiceType;

import java.util.ArrayList;
import java.util.List;

public class Administrator {

    public List<Client> clients = new ArrayList<>();
    private List<Employee> staff = new ArrayList<>();
    public List<Order> orders = new ArrayList<>();

    private static Administrator singleInstance;


    public static Administrator singleInstance() {

        if (singleInstance == null) {
            singleInstance = new Administrator();

        }
        return singleInstance;
    }


    /**
     * Metodo que muestra a los clientes registrados
     */
    public String showClients() {
        StringBuilder clientString = new StringBuilder();
        for (int i = 0; i < clients.size(); i++) {
            var num = i + 1;
            clientString.append(String.format("%d) %s\n", num, this.clients.get(i)));
        }
        return clientString.toString();
    }

    /**
     * Metodo que muestra al personal de la empresa
     */
    public String showStaff() {
        StringBuilder staffString = new StringBuilder();
        for (int i = 0; i < staff.size(); i++) {
            int num = i + 1;
            staffString.append(num).append(")").append(staff.get(i)).append("\n");

        }
        return staffString.toString();
    }

    /*
     * @param client: El cliente a agregar a la lista de clientes
     * @return: no retorna
     * */
    public String addClient(Client client) {
        this.clients.add(client);
        return "Se ha agregado correctamente";
    }

    /**/
    public String removeClient(Client cliente) {
        this.clients.remove(cliente);
        return "Se ha eliminado el cliente %s".formatted(cliente.getName());
    }

    /**
     * Metodo que sirve para añadir una nueva orden
     *
     * @param order nueva Order
     */
    public String addOrder(Order order) {
        this.orders.add(order);
        return "Se ha creado la Orden";
    }

    /**
     * Metodo que sirve para mostrar las ordenes disponibles
     */
    public String showOrders() {
        StringBuilder ordersString = new StringBuilder();
        for (int i = 0; i < orders.size(); i++) {
            var num = i + 1;

            ordersString.append(num).append(")").append(this.orders.get(i)).append("\n");
        }
        return ordersString.toString();
    }

    /**
     * Metodo que sirve para remover una orden
     */
    public String removeOrder(int opc) {
        orders.remove(opc);

        return "Se ha removido correctamente la orden";
    }


    public String provideService(Client client, ServiceType serviceType) {
        client.addService(serviceType);
        return "El cliente %s ha contratado %s FELICIDADES!".formatted(client.getName(), serviceType.getServiceName());
    }

    /**
     * Metodo que sirve para registrar la contratacion de un empleado
     *
     * @param newEmployee nuevo empleado
     * @return mensaje de contratar cliente
     */
    public String contractEmployee(Employee newEmployee) {
        staff.add(newEmployee);
        return "%s ha sido contratado%n".formatted(newEmployee.getName());
    }

    /**
     * Metodo que sirve para remover empleados de nuestra lista Employee
     *
     * @return retorna un String con un mensaje dado al despedir un empleado
     */
    public String fireEmploye(int op) {

        staff.remove(op);
        return "Se ha removido corrrectamente";
    }

    /**
     * Metodo que regresa la lista de clientes registrados en el sistema
     *
     * @return Regresa lista de clientes
     */
    public List<Client> getClients() {
        return clients;
    }

    /**
     * Metodo que modifica los atributos definidos en la lista de clients
     *
     * @param clients modifica lista clientes
     */
    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    /**
     * Metodo que regresa la lista del personal de la empresa registrados en el sistema
     *
     * @return lista de empleados
     */
    public List<Employee> getStaff() {
        return staff;
    }

    /**
     * Metodo que modifica los atributos definidos en la lista Employee
     *
     * @param staff modifica lista Employee
     */
    public void setStaff(List<Employee> staff) {
        this.staff = staff;
    }

    /**
     * Metodo que regresa la lista de ordenes registradas en el sistema
     *
     * @return lista de Ordenes
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Metodo que modifica los atributos definidos en la lista Orders
     *
     * @param orders modifica lista Orders
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
