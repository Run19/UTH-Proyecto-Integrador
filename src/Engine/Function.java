package Engine;


import Entities.Client;
import Entities.Employee;
import Entities.EmployeeType;
import Time.Date;
import Utilities.Order;
import Utilities.PhoneNumber;
import Utilities.ServiceType;
import Utilities.Shift;

import java.util.Scanner;

/**
 * @author Ian Cazabal Villada
 * @author Jose Maria Garcia Ramirez
 * @author Fani Michel Izquierdo Sosa
 * @author Erick Jesus Mota Oaxaca
 * @author Ricardo Rito Anguiano
 */
public class Function {
    Scanner input = new Scanner(System.in);
    Administrator administrator = new Administrator();

    /**
     * Metodo que se encarga de tomar los datos del cliente y añadirlo al
     * sistema
     */
    public void addClient() {
        System.out.println("\tANIADIR CLIENTE");

        System.out.println("Escribe el nombre: ");
        var name = input.nextLine();

        System.out.println("Escribe el apellido: ");
        var lastName = input.nextLine();

        System.out.println("NUMERO DE TELEFONO");

        System.out.println("Escribe la lada: ");
        var lade = input.nextInt();

        System.out.println("Escribe el numero: ");
        var num = input.nextInt();

        System.out.println("Escribe la companiia: ");
        var company = input.next();

        System.out.println("FECHA DE ALTA");

        System.out.println("Escribe el dia: ");
        var day = input.nextInt();

        System.out.println("Escriba el mes: ");
        var month = input.nextInt();

        System.out.println("Escriba el anio: ");
        var year = input.nextInt();

        administrator.addClient(new Client(name, lastName, new PhoneNumber(lade, num, company),
                new Date(day, month, year)));
    }

    /**
     * Metodo que sirve para mostrar a los clientes registrados
     */
    public void showClients() {
        administrator.showClients();
    }

    /**
     * Metodo que sirve para recolectar informacion para añadir una nueva
     * orden
     */
    public void addOrder() {


        showClients();
        System.out.println("Selecciona el cliente: ");
        var cliente = input.nextInt();
        var numC = cliente - 1;
        var client = administrator.clients.get(numC);
        System.out.println("Descripcion de la orden");
        var descript = input.next();

        administrator.addOrder(new Order(client, descript));
    }

    /**
     * Metodo que se encarga de mostrar a los clientes registrados
     */
    public void showOrders() {
        administrator.showOrders();
    }

    /**
     * Metodo que se encarga de tomar los datos del nuevo empleado y añadirlo al
     * sistema
     */
    public void contractEmployee() {
        System.out.println("Escribe el nombre: ");
        var name = input.next();

        System.out.println("Escribe el apellido: ");
        var lastName = input.next();


        System.out.println("1.- " + EmployeeType.programmer);
        System.out.println("2.- " + EmployeeType.administrator);
        System.out.println("3.- " + EmployeeType.maintenance);
        System.out.println("Seleccione tipo de empleado: ");
        var op = input.nextInt();
        EmployeeType type = null;
        if (op == 1) {
            type = EmployeeType.programmer;
        } else if (op == 2) {
            type = EmployeeType.administrator;
        } else if (op == 3) {
            type = EmployeeType.maintenance;
        } else {
            System.out.println("Escribe una opcion valida");
        }
        System.out.println("Introduce el salario: ");
        var salary = input.nextFloat();

        System.out.println("FECA DE CONTRATACION");
        System.out.println("Escribe el dia: ");
        var day = input.nextInt();

        System.out.println("Escriba el mes: ");
        var month = input.nextInt();

        System.out.println("Escriba el anio: ");
        var year = input.nextInt();
        System.out.println("Turno: ");
        System.out.println("1.- " + Shift.morning.getName());
        System.out.println("2.- " + Shift.afteernoon.getName());
        System.out.println("3.- " + Shift.night.getName());
        System.out.println("Seleccione el turno");
        var opc = input.nextInt();
        Shift turno = null;
        if (opc == 1) {
            turno = Shift.morning;
        } else if (opc == 2) {
            turno = Shift.afteernoon;
        } else if (opc == 3) {
            turno = Shift.night;
        } else {
            System.out.println("Seleccione una opcion valida");
        }
        System.out.println("Numero de telefono");
        System.out.println("Escribe la lada");
        var lada = input.nextInt();
        System.out.println("Escribe el numero");
        var num = input.nextInt();
        System.out.println("Escribe la companiia");
        var company = input.next();


        administrator.contractEmployee(new Employee(name, lastName, new PhoneNumber(lada, num, company), type, salary, new Date(day, month, year), turno));
    }

    /*
     * provee el servicio a un cliente
     * */
    public void provideService() {
        Scanner input = new Scanner(System.in);
        ServiceType type = null;
        administrator.showClients();
        System.out.println("Selecciona el cliente: ");
        var cliente = input.nextInt();
        var numC = cliente - 1;
        var client = administrator.clients.get(numC);
        System.out.println("Que tipo de servicio quieres contratar");
        System.out.println("1.- " + ServiceType.Internet.getNameService() + " $" + ServiceType.Internet.getServicePrice());
        System.out.println("2.- " + ServiceType.LocalPhone.getNameService() + " $" + ServiceType.LocalPhone.getServicePrice());
        System.out.println("3.- " + ServiceType.InternetPlusPhone.getNameService() + " $" + ServiceType.InternetPlusPhone.getServicePrice());

        int opc = input.nextInt();
        if (opc == 1) {
            type = ServiceType.Internet;
        } else if (opc == 2) {
            type = ServiceType.LocalPhone;
        } else if (opc == 3) {
            type = ServiceType.InternetPlusPhone;
        } else {
            System.out.println("Selecciona una opcion valida ");
        }
        administrator.provideService(client, type);
        System.out.println("Al cliente " + client.getName() + " Se ha agregado el servicio: " + type.getNameService() + " $" + type.getServicePrice());
    }

    /**
     * agrega un numero de telefono al cliente
     */
    public void addNumberClient() {
        showClients();
        System.out.println("Selecciona el cliente: ");
        var cliente = input.nextInt();
        var numC = cliente - 1;
        var client = administrator.clients.get(numC);
        System.out.println("Numero de telefono");
        System.out.println("Escribe la lada");
        var lada = input.nextInt();
        System.out.println("Escribe el numero");
        var num = input.nextInt();
        System.out.println("Escribe la companiia");
        var company = input.next();
        administrator.addNumberClient(client, new PhoneNumber(lada, num, company));
    }

    /**
     * Metodo que se encarga de mostrar el personal de la empresa
     */
    public void showStaff() {
        administrator.showStaff();
    }

    /**
     * Metodo que realiza la función de remover empleados
     */
    public void fireEmployee() {
        administrator.fireEmploye();
    }

    /**
     * Metodo que se encarga de remover una orden
     */
    public void removeOrder() {
        administrator.removeOrder();
    }

}

