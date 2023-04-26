package Homework;

import java.util.Scanner;
public class h07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your word: ");

        String word = sc.nextLine();

        System.out.println("Please enter your number: ");

        int num = sc.nextInt();

        if (num == word.length()) {
            System.out.println("The number is same with the word length");
        } else {
            System.out.println("The number is not same with the word length");
        }
    }    
}
