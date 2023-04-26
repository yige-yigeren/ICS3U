package Homework;

import java.util.Scanner;

public class h16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int times = 0;
        double lengths = 0;
        while (true) {
            times += 1;
            System.out.println("Please enter your Word:");
            String word = sc.nextLine();
            lengths = lengths + word.length();
            if (word.charAt(0) == 'p') {
                break;
            }
        }

        System.out.println("The entries times is " + times + "\nThe avanage length of the words is " + (lengths / times));
    }
}
