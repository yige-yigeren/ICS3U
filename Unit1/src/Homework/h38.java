package Homework;

import java.util.Scanner;

public class h38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many nums would you like?");

        int nums = sc.nextInt();

        int[] num = new int[nums];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter a num: ");
            num[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i] + " ");
        }
    }
}
