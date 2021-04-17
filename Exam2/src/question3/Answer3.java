/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Sandeep Nadendla
 */
public class Answer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for question 3: Sandeep Nadendla");
        ArrayList<Object> obj = new ArrayList<>();
        Loan l1 = new Loan(2321, "Savings", "Education", 150000.00);
        obj.add(l1);

        LocalDate d1 = LocalDate.now();
        obj.add(d1);

        String S1 = "Sandeep Nadendla";
        obj.add(S1);

        Circle c1 = new Circle(3.2);
        obj.add(c1);

        for (Object l : obj) {
            System.out.println(l);
        }

    }

}
