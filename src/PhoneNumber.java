//CHEMA
public class PhoneNumber {
    private int lada;
    private int number;
    private String company;


    PhoneNumber(int lada, int number, String company) {
        this.lada = lada;
        this.number = number;
        this.company = company;
    }

    public int getLada() {
        return this.lada;
    }

    public void setLada(int lada) {
        this.lada = lada;
    }

    public int getNumber() {
        return this.number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "" + this.lada + this.number + " " + this.company;
    }
}
