package Utilities;

import Entities.Client;
import Entities.Employee;

public class Order {

    private int orderId;
    private Client client;
    private Employee employee;
    private String orderDescription;


    public Order(int orderId, Client client, Employee employee, String orderDescription) {
        this.orderId = orderId;
        this.client = client;
        this.employee = employee;
        this.orderDescription = orderDescription;
    }

    public Order(int orderId, Client client, Employee employee) {
        this.orderId = orderId;
        this.client = client;
        this.employee = employee;
    }
}
