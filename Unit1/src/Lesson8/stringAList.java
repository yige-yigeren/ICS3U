package Lesson8;

import java.util.ArrayList;
import java.util.Scanner;

public class stringAList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> c = new ArrayList<Integer>(); //创建一个新的ArrayList对象a

        System.out.println("How many words do you want to enter?");
        int num = sc.nextInt();
        int longest = 0;
        String longestWord = "";
        ArrayList<String> a = new ArrayList<String>(num);
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter the word:");
            String word = sc.next();
            a.add(word);
            if (word.length() > longest) {
                longest = word.length();
                longestWord = word;
            }
        }
        System.out.println("The words you entered are:" + a);
        System.out.println("The longest word is " + longestWord + " and the length is " + longest);
    }
}
