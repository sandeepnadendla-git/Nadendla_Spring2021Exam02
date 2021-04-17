/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Sandeep nadendla
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private String dateHired;

    public Employee(String office, double salary, String dateHired, String name,
            String phoneNumber, String address, String email) {
        super(name, phoneNumber, address, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee  Person Name= " +super.getName()+ ", office= " + office
                + ", salary= " + salary + ", dateHired= " + dateHired ;
    }
    
}
