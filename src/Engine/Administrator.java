package Engine;

import Entities.Client;
import Entities.Employee;
import Time.Date;
import Utilities.Order;
import Utilities.PhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void showClients(){
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + ") " + clients.get(i));
        }

    }
    public void showStaff(){
        System.out.println(staff);
    }

    public String addClient(Client c){
        this.clients.add(c);
        return "Se ha anadido el cliente " + c.getName();
    }

    public void addOrder(Order order){
        this.orders.add(order);
        System.out.println("Se ha creado la Orden");
    }

    public void showOrders(){
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(i + ")" + orders.get(i));
        }
    }
    public void removeOrder(){
        showOrders();
        System.out.println("Que orden quieres remover?");
    }


    public void provideService(){

        clients.add(new Client("Juan", "Ramon",6,new PhoneNumber(255,6534231,"TELCEL"),
                new Date(11,4,2021)));

    }

    public String contractEmployee(Employee newEmployee) {
        staff.add(newEmployee);

        return "%s ha sido contratado".formatted(newEmployee.getName());

    }

    public void fireEmploye() {
        Scanner input = new Scanner(System.in);

            for (int i = 0; i < staff.size(); i++) {
                System.out.println(i + ")" + staff.get(i).getName());
            }
        System.out.println("Que empleado quieres remover?");
            int i = input.nextInt();

            staff.remove(i);
        System.out.println("*********************************");
        System.out.println("Se ha removido corrrectamente");
        System.out.println("*********************************");


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
