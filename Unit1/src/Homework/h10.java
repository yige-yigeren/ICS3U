package Homework;

import java.util.Scanner;

public class h10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first number: ");

        int num1 = sc.nextInt();

        System.out.println("Please enter your second number: ");

        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("The first number is divisible by the second number");
        } else {
            System.out.println("The first number is not divisible by the second number");
        }
    }    
}
