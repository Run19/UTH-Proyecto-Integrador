import java.util.ArrayList;
import java.util.List;


enum ServiceType {
    Internet("Internet", 450),
    LocalPhone("Telefonia local", 300),
    InternetPlusPhone("Internet+Telefonia", 550);

    private final String nameService;
    private final double servicePrice;


    ServiceType(String nameService, double servicePrice) {
        this.nameService = nameService;

        this.servicePrice = servicePrice;
    }

    public String getNameService() {
        return nameService;
    }

    public double getServicePrice() {
        return servicePrice;
    }
}

public class Client extends Person {
    private final int clientId;
    private final Date clientSince;
    private List<ServiceType> services = new ArrayList<>();

    public Client(String name, String lastname, int clientId, PhoneNumber phoneNumber, Date clientSince) {
        super(name, lastname);
        this.clientId = clientId;
        super.phoneNumbers.add(phoneNumber);
        this.clientSince = clientSince;

    }

    public Client(String name, String lastname, int clientId, Date clientSince, List<PhoneNumber> phoneNumber, List<ServiceType> services) {
        super(name, lastname);
        this.clientId = clientId;
        this.clientSince = clientSince;
        super.phoneNumbers = phoneNumber;
    }


    public int getClientid() {
        return clientId;
    }

    @Override
    public String show() {


        return "Clienteid :" + clientId +
                ", Nombre: " + name + '\'' +
                ", Apellido: " + lastname + '\'' +
                ", Dia de nacimiento: " + clientSince.shortDate() + '\'' +
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
}
