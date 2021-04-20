package Entities;

import Time.Date;
import Utilities.PhoneNumber;
import Utilities.Shift;

/**
 * Clase que contiene los atributos y metodos de un empleado
 *
 * @author Ian Cazabal Villada
 * @author Jose Maria Garcia Ramirez
 * @author Fani Michel Izquierdo Sosa
 * @author Erick Jesus Mota Oaxaca
 * @author Ricardo Rito Anguiano
 * @see Person
 */
public class Employee extends Person {

    private EmployeeType EmployeeType;
    private Shift shift;
    private float salary;
    private Date contractDate;

    /**
     * @param name:          Nombre de la persona
     * @param lastname:      Apellido de la persona
     * @param employeeType:  Tipo de empleado
     * @param salary:        Salario
     * @param employeeSince: Fecha desde que es empleado
     * @param shift:         Turno en el que trabaja
     * @see EmployeeType
     * @see Shift
     * @see Date
     * Metodo constructor parametrizado
     */
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

    /**
     * Metodo que realiza la función de mostrar el nombre de un empleado
     */
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
                ", Turno: " + shift.getName() +
                ", Numeros de telefono " + phoneNumbers;

    }

    /**
     * Metodo que se encarga de regresar el tipo de empleado
     *
     * @return Regresa EmployeeType
     */
    public EmployeeType getEmployeeType() {
        return EmployeeType;
    }

    /**
     * Metodo que sirve para asignar el tipo de empelado
     *
     * @param employeeType
     */
    public void setEmployeeType(EmployeeType employeeType) {
        EmployeeType = employeeType;
    }

    /**
     * Metodo que se encarga de regresar el salario que recibe un empleado
     *
     * @return Regresa Salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * Metodo que sirve para asignar el monto del salario de un empleado
     *
     * @param salary
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * Metodo que se encarga de regresar la fecha desde la que un empleado
     * trabaja
     *
     * @return Regresa employeeSince
     */
    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    /**
     * Metodo encargado de regresar el turno en que labora un empleado
     *
     * @return Regresa shift
     */
    public Shift getShift() {
        return shift;
    }

    /**
     * Metodo que realiza la funcion de asignar el turno de un empleado
     *
     * @param shift
     */
    public void setShift(Shift shift) {
        this.shift = shift;
    }
}

