package Lesson4;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 5;

        while (a != 0) {
            System.out.println("Please enter a number: ");
            a = sc.nextInt();

        }
        System.out.println("Bye!");
    }
}
