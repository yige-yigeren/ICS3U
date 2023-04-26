package Lesson6;

import java.util.Scanner;

public class forStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isThere = false;

        System.out.println("Please enter your word: ");
        
        String word = sc.nextLine();
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                isThere = true;
            }
        }
        if (isThere == true) {
            System.out.println("There is an 'a' in your word");
        } 
    }
}
