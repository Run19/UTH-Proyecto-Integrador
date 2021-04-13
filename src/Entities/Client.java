package Entities;

import Time.Date;
import Utilities.PhoneNumber;
import Utilities.ServiceType;

import java.util.ArrayList;
import java.util.List;


public class Client extends Person {
    private final int clientId;
    private final Date clientSince;
    public static int count;
    private List<ServiceType> services = new ArrayList<>();

    public Client(String name, String lastname, PhoneNumber phoneNumber, Date clientSince) {
        super(name, lastname);
        this.clientId = ++count;
        super.phoneNumbers.add(phoneNumber);
        this.clientSince = clientSince;

    }




    public int getClientid() {
        return clientId;
    }

    @Override
    public String toString() {


        return "Clienteid :" + clientId +
                ", Nombre: " + name + '\'' +
                ", Apellido: " + lastname + '\'' +
                ", Cliente desde: " + clientSince.shortDate() + '\'' +
                ", Numeros de telefono: " + phoneNumbers;
    }

    public String addService(ServiceType newService) {
        this.services.add(newService);
        return "El servicio de %s ha sido agregado".formatted(newService.toString());
    }

    public String removeService(ServiceType newService) {
        this.services.remove(newService);
        return "El servicio de %s ha sido removido".formatted(newService.toString());
    }

    @Override
    public String show() {
        return null;
    }
}
