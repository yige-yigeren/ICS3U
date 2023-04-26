package Homework;

import java.util.Scanner;

public class h09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first word: ");

        String word1 = sc.nextLine();

        System.out.println("Please enter your second word: ");

        String word2 = sc.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer than " + word2 + ", by " + (word1.length() - word2.length()) + " letters");
        } else if (word1.length() < word2.length()) {
            System.out.println(word2 + " is longer than " + word1 + ", by " + (word2.length() - word1.length()) + " letters");
        } else {
            System.out.println(word1 + " and " + word2 + " are the same length");
        }

    }
}
