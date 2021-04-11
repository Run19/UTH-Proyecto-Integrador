package Engine;

import Entities.Client;
import Entities.Employee;
import Utilities.Order;

import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private List<Client> clients = new ArrayList<>();
    private List<Employee> staff = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();


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

    public String contractEmployee(Employee newEmployee) {
        staff.add(newEmployee);
        return "%s ha sido contratado".formatted(newEmployee.getName());
    }

    public void fireEmploye(Employee newEmployee) {
        if (staff.contains(newEmployee)) {
            staff.remove(newEmployee);
        }
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
