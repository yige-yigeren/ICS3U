package Lesson3;

import java.util.Scanner;   // Import the Scanner class

public class input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        int a = 5;

        System.out.println("Whar is your name?");

        String name = sc.nextLine(); // gets a string from the user and stores it in name

        System.out.println(name + ", your name is awesome!");

        System.out.println("How old are you?");

        int age = sc.nextInt(); // gets an integer from the user and stores it in age

        System.out.println("Wow! " + age + " is really old!");

        
        
    }
}
