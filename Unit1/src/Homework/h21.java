package Homework;

import java.util.Scanner;

public class h21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your word: ");

        String word = sc.nextLine();

        System.out.println("Please enter your character: ");

        char letter = sc.next().charAt(0);

        sc.close();

        boolean isThere = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                isThere = true;
            }
        }
        if (isThere == true) {
            System.out.println("There is an " + letter + " in your word");
        } else {
            System.out.println("There is not an " + letter + " in your word");
        }
    }
}
