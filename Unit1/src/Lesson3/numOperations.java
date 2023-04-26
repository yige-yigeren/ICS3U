package Lesson3;

import java.util.Scanner;

public class numOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");

        int num1 = sc.nextInt();

        System.out.println("Please enter second number: ");

        int num2 = sc.nextInt();

        System.out.print(num1 + " + " + num2 + " = ");
        System.out.println(num1 + num2);
        System.out.print(num1 + " - " + num2 + " = ");
        System.out.println(num1 - num2);
        System.out.print(num1 + " * " + num2 + " = ");
        System.out.println(num1 * num2);
        System.out.print(num1 + " / " + num2 + " = ");
        System.out.println((double)num1 / num2);
        

    }    
}
