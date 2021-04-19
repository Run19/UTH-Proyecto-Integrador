package Entities;

import Time.Date;
import Utilities.PhoneNumber;
import Utilities.Shift;

public class Employee extends Person {

    private EmployeeType EmployeeType;
    private Shift shift;
    private float salary;
    private Date contractDate;


    public Employee(String name, String lastname, Entities.EmployeeType employeeType, float salary, Date employeeSince, Shift shift) {
        super(name, lastname);
        EmployeeType = employeeType;
        this.salary = salary;
        this.contractDate = employeeSince;
        this.shift = shift;
    }

    public Employee(String name, String lastname, PhoneNumber phoneNumber, Entities.EmployeeType employeeType, float salary, Date employeeSince, Shift shift) {
        super(name, lastname, phoneNumber);
        EmployeeType = employeeType;
        this.salary = salary;
        this.contractDate = employeeSince;
        this.shift = shift;
    }

    @Override
    public String show() {
        return " Nombre del empleado " + super.name;
    }

    @Override
    public String toString() {
        return " Nombre: " + name +
                ", Apellido: " + lastname +
                ", Tipo de empleado: " + EmployeeType +
                ", Salario: $" + salary +
                ", Empleado desde: " + contractDate.shortDate() +
                ", Turno: " + shift.getName()+
                ", Numeros de telefono " + phoneNumbers;

    }

    public EmployeeType getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        EmployeeType = employeeType;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}

