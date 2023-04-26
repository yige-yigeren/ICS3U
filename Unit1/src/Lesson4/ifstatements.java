package Lesson4;

import java.util.Scanner;

import Lesson2.operations;

public class ifstatements {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("The number is positive");
        } else if (num1 < 0) {
            System.out.println("The number is nagative");
        } else {
            System.out.println("The number is 0");
        }

        /*
        * other type of comparison
        * <, >, <=, >=, ==, !=(not equal)
        */

        

    }
}
