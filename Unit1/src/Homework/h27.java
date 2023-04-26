package Homework;

import java.util.Scanner;

public class h27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number(odd): ");
        int num = sc.nextInt();
        sc.close();

        if (num <= 0 || num % 2 == 0) {
            System.out.println("Please enter a positive odd number.");
        } else if (num > 25){
            System.out.println("Please enter a smaller number.");
        }
        else {
            for (int i = num / 2; i < num; i++) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (i * 2 + 1); j++) {
                    System.out.print("**");
                }
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                System.out.println();
            }
            for (int i = num; i >= 0; i--) {
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (i * 2 + 1); j++) {
                    System.out.print("**");
                }
                for (int j = 0; j < num - i; j++) {
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }
}
