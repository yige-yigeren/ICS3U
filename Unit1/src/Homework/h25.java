package Homework;

import java.util.Scanner;

public class h25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = sc.nextLine();
        sc.close();

        String reverses = "";
        for (int i = 0; i < word.length(); i++) {
            reverses = reverses + word.charAt(word.length() - 1 - i);
        }
        System.out.println(reverses);
    }
}
