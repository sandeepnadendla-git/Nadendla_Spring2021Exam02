/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Sandeep Nadendla
 */
public class Answer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Answer for question 2: Sandeep Nadendla");
       System.out.print("Enter rows size of the array: ");
        int rSize = sc.nextInt();
        System.out.print("Enter column size of the array: ");
        int CSize = sc.nextInt();
        int[][] arr1 = new int[CSize][rSize];
        int[][] arr2 = new int[CSize][rSize];
        System.out.print("Enter list1: ");
        for (int c = 0; c < CSize; c++) {
            for (int r = 0; r < rSize; r++) {
                arr1[c][r] = sc.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        for (int c = 0; c < CSize; c++) {
            for (int r = 0; r < rSize; r++) {
                arr2[c][r] = sc.nextInt();
            }
        }
        if (equals(arr1, arr2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {

        for (int c = 0; c < m1.length; c++) {
            for (int r = 0; r < m1[0].length; r++) {
                if (m1[c][r] != m2[c][r]) {
                    return false;
                }
            }
        }
        return true;
    }

}
