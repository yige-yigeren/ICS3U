package Homework;

import java.util.Scanner;
public class h06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your word: ");

        String word = sc.nextLine();

        System.out.println("Please enter your number: ");

        int num = sc.nextInt();

        num = num - 1;

        System.out.println(word.charAt(num));
    
    }
}
