package Lesson5;

import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int largest = num;
        int smallest = num;

        while (true) {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("The max is: " + largest);
                System.out.println("The min is: " + smallest);
                break;
            }
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sc.close();

        }
    }
}
