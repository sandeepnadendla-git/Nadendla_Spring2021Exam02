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
public class Staff extends Employee{
    
    private String title;

    public Staff(String title, String office, double salary, String dateHired, 
            String name, String phoneNumber, String address, String email) {
        super(office, salary, dateHired, name, phoneNumber, address, email);
        this.title = title;
    }


    @Override
    public String toString() {
        return "Staff: Person Name= "+super.getName()+ ", title= " + title;
    }
       
}

