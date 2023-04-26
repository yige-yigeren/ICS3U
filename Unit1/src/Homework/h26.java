package Homework;

import java.util.Scanner;

public class h26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();
        sc.close();

        // makes a pyramid of stars

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i * 2 + 1); j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < num - i; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Please enter a positive number.");
        }
    }
}
