import java.util.List;

public class Client extends Person {
    private final int clientId;
    private final Date birthDate;

    public Client(String name, String lastname, int clientId, PhoneNumber phoneNumber, Date birthDate) {
        super(name, lastname);
        this.clientId = clientId;
        super.phoneNumbers.add(phoneNumber);
        this.birthDate = birthDate;

    }

    public Client(String name, String lastname, int clientId, Date birthDate, List<PhoneNumber> phoneNumber) {
        super(name, lastname);
        this.clientId = clientId;
        this.birthDate = birthDate;
        super.phoneNumbers = phoneNumber;
    }



    public int getClientid() {
        return clientId;
    }

    @Override
    public String showProperties() {

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Clienteid :").append(clientId);
        stringBuilder.append(", Nombre: ").append(name).append('\'');
        stringBuilder.append(", Apellido: ").append(lastname).append('\'');
        stringBuilder.append(", Dia de nacimiento: ").append(birthDate.shortDate()).append('\'');
        stringBuilder.append(", Numeros de telefono: ").append(phoneNumbers);


        return stringBuilder.toString();
    }
}
