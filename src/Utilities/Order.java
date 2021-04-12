package Utilities;

import Entities.Client;
import Entities.Employee;

public class Order {

    private int orderId;
    private Client client;
    private Employee employee;
    private String orderDescription;
    private ServiceType serviceType;


    public Order(int orderId, Client client, Employee employee, String orderDescription,ServiceType serviceType) {
        this.orderId = orderId;
        this.client = client;
        this.employee = employee;
        this.orderDescription = orderDescription;
        this.serviceType = serviceType;

    }

    public Order(int orderId, Client client, Employee employee) {
        this.orderId = orderId;
        this.client = client;
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", client=" + client.show() +
                ", orderDescription='" + orderDescription + '\'' +
                ", serviceType=" + serviceType +
                '}';
    }
}
