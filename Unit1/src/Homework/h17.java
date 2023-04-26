package Homework;

import java.util.Scanner;

public class h17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lenm = 0;
        String wordm = "";
        while (true) {
            System.out.println("Please enter your word: ");
            String word = sc.nextLine();

            if (word.equals("EXIT")) {
                break;
            } else if (lenm < word.length()) {
                wordm = word;
            }
        }
        System.out.println("The longest word is " + wordm);
    }
}
