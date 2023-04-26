package Homework;

import java.util.Scanner;

public class h20 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your first number: ");
    int num1 = sc.nextInt();
    System.out.println("Please enter your second number: ");
    int num2 = sc.nextInt();
    sc.close();

    int sum = 0;
    if (num1 > num2) {
        for (int i = num2; i <= num1; i++) {
            sum = sum + i;
        }
        System.out.println("The sum from the first number to the second number is " + sum);
    } else if (num1 < num2) {
        for (int i = num1; i <= num2; i++) {
            sum = sum + i;
        }
        System.out.println("The sum from the first number to the second number is " + sum);
    } else {
        System.out.println("The first number is equal to the second number");
        System.out.println("The sum from the first number to the second number is " + num1);
    }
    }
}
