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
public class Answer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Answer for question 5: Sandeep Nadendla");
        Person p1 = new Person("Narayana", "2345678912", "Maryville", "narayana@gmail.com");
        Student stud1 = new Student("A", "Sandeep", "2342345455", "Maryville", "san@gmail.com");
        Employee emp1 = new Employee("ACS", 360, "12/01/2020", "Sujith", "1234432343",
                "Maryville", "sujith@gmail.com");
        Faculty faculty1 = new Faculty(20, 1, "ACS", 360, "12/01/2020", "Christina"
                , "3443424324", "Maryville", "chris@gmail.com");
        Staff staff1 = new Staff("Assistant professor", "ACS", 360, "12/01/2020"
                , "Ramesh", "3424244123", "Maryville", "Ram@gmail.com");

        System.out.println(p1);
        System.out.println(stud1);
        System.out.println(emp1);
        System.out.println(faculty1);
        System.out.println(staff1);

    }
}
