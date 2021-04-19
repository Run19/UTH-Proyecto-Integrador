package Utilities;

public enum ServiceType {
    Internet("Internet", 450),
    LocalPhone("Telefonia local", 300),
    InternetPlusPhone("Internet+Telefonia", 550);

    private final String serviceName;
    private final double servicePrice;


    ServiceType(String nameService, double servicePrice) {
        this.serviceName = nameService;

        this.servicePrice = servicePrice;
    }

    public String getServiceData() {

        return "%s %.2f".formatted(serviceName, servicePrice);
    }


    public String getServiceName() {
        return serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }
}

