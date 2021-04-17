/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author S541768
 */
public class Answer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Answer for question 6: Sandeep Nadendla");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side one");
        int side1 = scan.nextInt();
        System.out.println("Enter side two");
        int side2 = scan.nextInt();
        System.out.println("Enter side three");
        int side3 = scan.nextInt();
        System.out.println("enter color");
        String color = scan.next();
        System.out.println("is filled or not");
        boolean isFilled = scan.nextBoolean();

        Triangle t1 = new Triangle(side1, side2, side3, color, isFilled);

        System.out.println(t1.toString());
    }
}
