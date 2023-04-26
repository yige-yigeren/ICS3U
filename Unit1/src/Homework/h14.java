package Homework;

import java.util.Scanner;

public class h14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number and input nagetive will exit");

        int sum = 0;
        int num = 0;
        while (true) {
            System.out.println("Please enter your number: ");
            num = sc.nextInt();
            if (num < 0) {
                break;
            }
                 sum = num + sum;
            System.out.println("You input " + num + "\nThe sum of the numbers is " + sum);
        }
        System.out.println("The sum of the numbers is " + sum);
    }
}
