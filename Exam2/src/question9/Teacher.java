/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Sandeep Nadendla
 */
public class Teacher implements Employee,Person {

    @Override
    public void showEmployeeId() {
        System.out.println("Method from Employee my id is 323232");
    }

    @Override
    public void showPassportNumber() {
        System.out.println("Method from Person my passport number is 12323");
    }    
}
