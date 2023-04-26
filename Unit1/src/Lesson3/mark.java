package Lesson3;

import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        double mark = 0.0;
        double markadd = 0.0;
        double markpre = 0;
        int rand = 0;
        Scanner sc = new Scanner(System.in);
        for (int done = 1;done == 1;) {
            System.out.println("Your mark is " + mark + "%, You have " + rand + " times to add a mark.");
            System.out.println("Please enter your mark: ");
            markadd = sc.nextDouble();
            System.out.println("Please enter your precentage: (%)");
            markpre = sc.nextDouble();
            mark = mark + (markadd * markpre * 0.01);
            System.out.println("Do you have another mark to add? (1 for yes, 0 for no)");
            done = sc.nextInt();
            rand = rand + 1;
        }
        System.out.println("Your mark is " + mark + "%");
    }
}
