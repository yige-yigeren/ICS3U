package Homework;

import java.util.Scanner;
import java.math.*;

public class h05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your number: ");

        int num = sc.nextInt();

        System.out.println("Random 0 - " + num +" is: " + (int)(Math.random() * (num + 1)));
    }
}
