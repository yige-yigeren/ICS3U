package Homework;

import java.util.Scanner;

public class h51 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number of rows:");
    int row = sc.nextInt();
    System.out.println("Please enter the number of columns:");
    int col = sc.nextInt();
    int[][] a = new int[row][col];

    while (true) {
        System.out.println("Please enter the number of rows: (enter -1 to exit))");
        row = sc.nextInt();
        if (row == -1) {
            break;
        }
        System.out.println("Please enter the number of columns:");
        col = sc.nextInt();
        System.out.println("Please enter the number of" + row + " " + col + ":");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("The number cannot be 0.");
        } else if (a[row][col] == 0) {
            a[row][col] = num;
        } else {
            System.out.println("The location is occupied, please enter again.");
        }
    }
}
}

