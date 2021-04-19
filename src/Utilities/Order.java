package Utilities;

import Entities.Client;

public class Order {

    private final int orderId;
    private final Client client;

    private String orderDescription;
    private ServiceType serviceType;
    public static int cont;


    public Order(Client client, String orderDescription, ServiceType serviceType) {
        this.orderId = ++cont;
        this.client = client;
        this.orderDescription = orderDescription;


    }


    @Override
    public String toString() {
        return "Orden Id: " + orderId +
                ", cliente: " + client.getName() +" " + client.getLastname() +
                ", Descripcion de la orden:" + orderDescription ;
    }
}
