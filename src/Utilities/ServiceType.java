package Utilities;

public enum ServiceType {
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

