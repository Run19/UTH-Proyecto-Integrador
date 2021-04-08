import java.util.List;

public class Client extends Person {
    private final int clientId;

    public Client(String name, String lastname, int clientId, PhoneNumber phoneNumber) {
        super(name, lastname);
        this.clientId = clientId;
        super.phoneNumbers.add(phoneNumber);
    }

    public Client(String name, String lastname, int clientId, List<PhoneNumber> phoneNumber) {
        super(name, lastname);
        this.clientId = clientId;
        super.phoneNumbers = phoneNumber;
    }

    public int getClientid() {
        return clientId;
    }

    @Override
    public String showProperties() {

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Clienteid :").append(clientId);
        stringBuilder.append(", nombre: ").append(name).append('\'');
        stringBuilder.append(", Apellido: ").append(lastname).append('\'');
        stringBuilder.append(", Numeros de telefono: ").append(phoneNumbers);

        return stringBuilder.toString();
    }
}
