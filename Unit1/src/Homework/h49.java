package Homework;

import java.util.Scanner;

public class h49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[4][3];
        for (int i=0;i<4;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("Please enter the number of " + i + " " + j + ":");
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int lox = 0;
        int loy = 0;
        int max = a[0][0];
        for (int i=0;i<4;i++) {
            for (int j=0;j<3;j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    lox = i + 1;
                    loy = j + 1;
                }
            }
        }
        System.out.println("The largest number is " + max + " and the location is " + lox + " " + loy);
    }
}
