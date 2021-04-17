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
public class Person {

    private String name;
    private String phoneNumber;
    private String address;
    private String email;

      public Person(String name, String phoneNumber, String address, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address=address;
        this.email = email;
    }
      
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Person: " + "Person Name= " + name + ", Phone Number= " + phoneNumber
                + ", Address= "+address+", email= " + email;
    }
}
