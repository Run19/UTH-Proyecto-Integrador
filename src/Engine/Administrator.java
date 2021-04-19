package Engine;

import Entities.Client;
import Entities.Employee;
import Utilities.Order;
import Utilities.ServiceType;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void showClients() {
        for (int i = 0; i < clients.size(); i++) {
            var num = i + 1;
            System.out.println(num + ")" + this.clients.get(i));

        }

    }

    public void showStaff() {
        for (int i = 0; i < staff.size(); i++) {
            int num = i + 1;
            System.out.println(num + ")" + staff.get(i));
        }
    }

    /*
     * @param client: El cliente a agregar a la lista de clientes
     * @return: no retorna
     * */
    public void addClient(Client client) {
        this.clients.add(client);
        System.out.println("Se ha agregado correctamente");
    }

    public void removeClient(Client cliente) {
        this.clients.remove(cliente);

    }


    public void addOrder(Order order) {
        this.orders.add(order);

        System.out.println("Se ha creado la Orden");
    }

    public void showOrders() {
        for (int i = 0; i < orders.size(); i++) {
            var num = i + 1;
            System.out.println(num + ")" + this.orders.get(i));
        }
    }

    public void removeOrder() {
        Scanner input = new Scanner(System.in);
        showOrders();
        System.out.println("Que orden quieres remover?");
        int opc = input.nextInt();
        opc = opc - 1;
        orders.remove(opc);
        System.out.println("Se ha removido correctamente");


    }


    public void provideService(Client client, ServiceType serviceType) {
        client.addService(serviceType);
        System.out.println("El servicio se ha aniadido");
    }

    public void contractEmployee(Employee newEmployee) {
        staff.add(newEmployee);
        System.out.printf("%s ha sido contratado%n", newEmployee.getName());
    }

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
