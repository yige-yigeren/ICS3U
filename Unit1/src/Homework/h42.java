package Homework;

import java.util.Scanner;

public class h42 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number:");
    int row = sc.nextInt();
    int[] a = new int[row];

    while (true) {
        System.out.println("Please enter the number: (enter -1 to exit))");
        row = sc.nextInt();
        if (row == -1) {
            break;
        }
        System.out.println("Please enter the number of" + row + " " + ":");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("The number cannot be 0.");
        } else if (a[row] == 0) {
            a[row] = num;
        } else {
            System.out.println("The location is occupied, please enter again.");
        }
    }
}
}

