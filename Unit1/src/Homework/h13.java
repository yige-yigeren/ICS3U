package Homework;

import java.util.Scanner;

public class h13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first word: ");

        String word1 = sc.nextLine();

        System.out.println("Please enter your second word: ");

        String word2 = sc.nextLine();

        if (word1.charAt(0) == word2.charAt(0) && word1.charAt(word1.length() - 1) == word2.charAt(word2.length() - 1)) {
            System.out.println("The first letter and last letter are the same");
        } else {
            System.out.println("The first letter and last letter are not the same");
        }
    }  
}
