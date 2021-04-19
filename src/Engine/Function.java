package Engine;


import Entities.Client;
import Entities.Employee;
import Entities.EmployeeType;
import Time.Date;
import Utilities.Order;
import Utilities.PhoneNumber;
import Utilities.ServiceType;
import Utilities.Shift;

import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Function {
    Scanner input = new Scanner(System.in);
    Administrator administrator = Administrator.singleInstance();

    public void addClient() {
        System.out.println("\tANIADIR CLIENTE");

        System.out.println("Escribe el nombre: ");
        var name = input.next();

        System.out.println("Escribe el apellido: ");
        var lastName = input.next();

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

    public void showClients() {
        administrator.showClients();
    }

    public void addOrder() {


        administrator.showClients();
        System.out.println("Selecciona el cliente: ");
        var cliente = input.nextInt();
        var numC = cliente - 1;
        var client = administrator.clients.get(numC);
        System.out.println("Descripcion de la orden");
        var descript = input.next();
        System.out.println("\tSERVICIO");
        System.out.println("1.- " + ServiceType.Internet + " $" + ServiceType.Internet.getServicePrice());
        System.out.println("2.- " + ServiceType.LocalPhone + " $"+  ServiceType.LocalPhone.getServicePrice());
        System.out.println("3.- " + ServiceType.InternetPlusPhone+ " $" + ServiceType.InternetPlusPhone.getServicePrice());
        System.out.println("Seleccione el tipo de servicio");
        var opc = input.nextInt();
        ServiceType type = null;
        if (opc == 1) {
            type = ServiceType.Internet;
        } else if (opc == 2) {
            type = ServiceType.LocalPhone;
        } else if (opc == 3) {
            type = ServiceType.InternetPlusPhone;
        } else {
            System.out.println("Selecciona una opcion valida ");
        }


        administrator.addOrder(new Order(client, descript, type));
    }

    public void showOrders() {
        administrator.showOrders();
    }

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
        System.out.println("1.- " + Shift.morning);
        System.out.println("2.- " + Shift.afteernoon);
        System.out.println("3.- " + Shift.night);
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


        administrator.contractEmployee(new Employee(name, lastName, type, salary, new Date(day, month, year), turno));
    }

    public void showStaff() {
        administrator.showStaff();
    }

    public void fireEmployee() {
        administrator.fireEmploye();
    }

    public void removeOrder() {
        administrator.removeOrder();
    }

}

