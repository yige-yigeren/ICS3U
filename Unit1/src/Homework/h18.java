package Homework;

import java.util.Scanner;
import java.math.*;

public class h18 {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 100);
        System.out.println("Try a number between 0 and 100");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (guess != num) {
            if (guess > num) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Too low, try again");
            }
            guess = sc.nextInt();
        }
        System.out.println("You got it!" + num);
        sc.close();
    }
}
