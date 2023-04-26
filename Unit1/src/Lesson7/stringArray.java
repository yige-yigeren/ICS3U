package Lesson7;

import java.util.Scanner;

public class stringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many words would you like?");
        int numWords = sc.nextInt();
        String[] words = new String[numWords];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter a word: ");
            words[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " ");
        }


    }
}
