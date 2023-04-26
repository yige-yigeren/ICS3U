package Lesson3;

import java.util.Scanner; 

public class input2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.println("Please enter your name: ");

        String name = sc.nextLine(); 

        System.out.println("Your name is " + name.length() + " characters long.");
        System.out.println("The first letter of your name is " + name.charAt(0) + ".");
        System.out.println("The last letter of your name is " + name.charAt(name.length() - 1) + ".");




    }
}
