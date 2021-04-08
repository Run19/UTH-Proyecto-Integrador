import java.util.List;

public class Client extends Person {
    private final int clientId;
    private final Date dateBirth;

    public Client(String name, String lastname, int clientId, PhoneNumber phoneNumber, Date dateOfBirth) {
        super(name, lastname);
        this.clientId = clientId;
        super.phoneNumbers.add(phoneNumber);
        this.dateBirth = dateOfBirth;

    }

    public Client(String name, String lastname, int clientId, Date dateOfBirth, List<PhoneNumber> phoneNumber) {
        super(name, lastname);
        this.clientId = clientId;
        this.dateBirth = dateOfBirth;
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
        stringBuilder.append(", Dia de nacimiento: ").append(dateBirth.shortDate()).append('\'');
        stringBuilder.append(", Numeros de telefono: ").append(phoneNumbers);


        return stringBuilder.toString();
    }
}
