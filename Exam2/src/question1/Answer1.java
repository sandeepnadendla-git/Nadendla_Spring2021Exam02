/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sandeep Nadendla
 */
public class Answer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Answer for question 1: Sandeep Nadendla");
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            arr.add(sc.nextInt());
        }
        removeDuplicate(arr);

    }

    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> uniqArr = new ArrayList<Integer>();
        uniqArr.add(list.get(0));
        System.out.print("The distinct integers are " + uniqArr.get(0) + " ");

        for (int i : list) {
            if (!(uniqArr.contains(i))) {
                uniqArr.add(i);
                System.out.print(i + " ");
            }
        }
    }

}
