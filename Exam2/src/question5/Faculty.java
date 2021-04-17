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
public class Faculty extends Employee{
    private double officeHours;
    private int numberOfsubject;

    public Faculty(double officeHours, int numberOfsubject, String office, 
            double salary, String dateHired, String name, String phoneNumber,
            String address, String email) {
        super(office, salary, dateHired, name, phoneNumber, address, email);
        this.officeHours = officeHours;
        this.numberOfsubject = numberOfsubject;
    }

    @Override
    public String toString() {
        return "Faculty: Person Name= "+super.getName() + ""
                + ", officeHours= " + officeHours + ""
                + ", numberOfsubject= " + numberOfsubject;
    }
    
    
    
}

