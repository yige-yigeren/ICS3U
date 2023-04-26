package Lesson4;

import java.util.Scanner;
public class stringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name = sc.nextLine();

        if (name.charAt(0) == 'A' || name.charAt(0) == 'a') {
            System.out.println("Your name is awesome");
        } else {
            System.out.println("Please change your name");
        }

        if (name.equals("andrew") || name.equals("Andrew")) {
            System.out.println("Your name is andrew");
        } else {
            System.out.println("Please change your name");
        }
    }
}
