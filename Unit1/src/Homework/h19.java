package Homework;

import java.util.Scanner;

public class h19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
    }
}
