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
public class Student extends Person {
    
    private String grade;
    private static final String classStatus="Graduate";

    public Student(String grade, String name, String phoneNumber, String address
            , String email) {
        super(name, phoneNumber, address, email);
        this.grade = grade;
    }   

    @Override
    public String toString() {
        return "Student: Person Name= "+super.getName()+ ", grade= " + grade + ""
                + ", classStatus= " + classStatus;
    }   
}

