package Entities;

import Time.Date;
import Utilities.Shift;

public class Employee extends Person {


    private EmployeeType EmployeeType;
    private float salary;
    private Date employeeSince;
    private Shift shift;

    public Employee(String name, String lastname) {
        super(name, lastname);
    }


    @Override
    public String show() {
        return " Nombre del empleado" + super.name;
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

    public Date getEmployeeSince() {
        return employeeSince;
    }

    public void setEmployeeSince(Date employeeSince) {
        this.employeeSince = employeeSince;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }
}

