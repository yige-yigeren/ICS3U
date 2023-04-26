package Homework;

import java.util.Scanner;

public class h22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word: ");
        String word = sc.nextLine();
        sc.close();

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A' || word.charAt(i) == 'e' || word.charAt(i) == 'E' || word.charAt(i) == 'i' || word.charAt(i) == 'I' || word.charAt(i) == 'o' || word.charAt(i) == 'O' || word.charAt(i) == 'u' || word.charAt(i) == 'U') {
                count++;
            }
        }

        System.out.println("There are " + count + " vowels in your word");
    }
}
