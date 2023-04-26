package Lesson5;

import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word;

        while (true) {
            System.out.println("Please enter your word (type 'exit' to end): ");

            word = sc.nextLine();

            if (word.equals("exit")) {
                break; // Breaks out of the loop
            }
        }
        System.out.println("Bye!");
        sc.close();
    }
}
