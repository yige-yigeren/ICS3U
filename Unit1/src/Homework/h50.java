package Homework;

import java.util.Scanner;

public class h50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = new int[3][3];

        System.out.println("You want to CW or CCW? (1/-1)");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    b[j][2-i] = a[i][j];
                }
            }
        } else if (choice == -1) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    b[2-j][i] = a[i][j];
                }
            }
        } else {
            System.out.println("Invalid input");
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
