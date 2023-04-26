package Lesson6;

import java.util.Scanner;

public class forString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("How many words would you like? ");

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Please enter your word: ");
            String word = sc.next();
            for (int j=0; j<word.length(); j++) {
                if (word.charAt(j) == 'a' || word.charAt(j) == 'A') {
                    count++;
                }
            }
        }

        System.out.println("There are " + count + " letter As");

        sc.close();
    }
}
