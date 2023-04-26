package Homework;

import java.util.Scanner;

public class h08 {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Please enter your first word: ");
    
        String word1 = sc.nextLine();
    
        System.out.println("Please enter your second word: ");

        String word2 = sc.nextLine();

        if (word1.length() <= 2 || word2.length() <= 2) {
             System.out.println("The words are too short");
         } else {
            if (word1.substring(0, 3).equals(word2.substring(0, 3))) {
                System.out.println("The first three letters are the same");
            } else {
                System.out.println("The first three letters are not the same");
            }
         }
    }
}
