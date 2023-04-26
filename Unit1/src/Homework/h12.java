package Homework;

import java.util.Scanner;

public class h12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choice circle(1) or square(2): ");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Please enter the radius: ");

            double radius = sc.nextDouble();

            System.out.println("The circumference of the circle is: " + (Math.PI * radius * 2) + "\nThe area of the circle is: " + (Math.PI * radius * radius));
        } else if (choice == 2) {
            System.out.println("Please enter the length of the side: ");

            double side = sc.nextDouble();

            System.out.println("The circumference of the square is: " + (side * 4) + "\nThe area of the square is: " + (side * side));
        } else {
            System.out.println("Invalid choice");
        }
    }    
}
