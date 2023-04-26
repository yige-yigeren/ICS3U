package Homework;

import java.util.Scanner;

public class h39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many nums would you like?");
        int num1s = sc.nextInt();

        int[] num1 = new int[num1s];

        for (int i = 0; i < num1.length; i++) {
            System.out.println("Enter a num: ");
            num1[i] = sc.nextInt();
        }
        System.out.println("How many nums would you like?");
        int num2s = sc.nextInt();

        int[] num2 = new int[num2s];

        for (int i = 0; i < num2.length; i++) {
            System.out.println("Enter a num: ");
            num2[i] = sc.nextInt();
        }

        sc.close();

        int[] num = new int[num1.length + num2.length];

        for (int i = 0; i < num1.length; i++) {
            num[i] = num1[i];
        }

        for (int i = 0; i < num2.length; i++) {
            num[i + num1.length] = num2[i];
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }    
}
