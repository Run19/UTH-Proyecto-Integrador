package Utilities;

import Entities.Client;

public class Order {

    private int orderId;
    private Client client;

    private String orderDescription;
    private ServiceType serviceType;
    public static int cont;


    public Order(Client client, String orderDescription, ServiceType serviceType) {
        this.orderId = ++cont;
        this.client = client;

        this.orderDescription = orderDescription;
        this.serviceType = serviceType;

    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", client=" + client.getName() +
                ", orderDescription='" + orderDescription + '\'' +
                ", serviceType=" + serviceType +
                '}';
    }
}
