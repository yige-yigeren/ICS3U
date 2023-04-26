package Exam;
import java.util.Scanner;

// Name:Mr. Lei
// Course Code: ICS3U
// Date: 2023-04-25
// This code is for In-class Programming Exam.
// Welcome to view my github account: https://github.com/yige-yigeren
// Have a nice day!

public class Inclass {
    // Method Require 1
    // print array
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        } 
        System.out.println();
    }

    // Method Require 2
    // print 2D array
    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method Require 3
    // replace the number in 2D array
    static int[] replace(int[] a,int b,int c) {
        for (int i = 0; i < a.length; i++) {
                if (a[i] == b) {
                    a[i] = c;
                }
        }
        return a;
    }

    // Method Require 4
    // find the second highest and lowest
    static void second(int[] a) {
        // h == highest, l == lowest
        int h1=a[1];
        int h2=a[1];
        int l1=a[1];
        int l2=a[1];
        // find the second highest and second lowest
        for (int i = 0; i < a.length; i++) {
            if (a[i] > h1) {
                h2 = h1;
                h1 = a[i];
            } else if (a[i] > h2) {
                h2 = a[i];
            }
            if (a[i] < l1) {
                l2 = l1;
                l1 = a[i];
            } else if (a[i] < l2) {
                l2 = a[i];
            }
        }
        // print the second highest and second lowest
        System.out.println("The second highest is " + h2 + ", and the second lowest is " + l2 + ".");
    }

    // Method Require 5
    // 2D array to 1D array
    static int[] two2one(int[][] a) {
        int[] b = new int[a.length*a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a[i].length; j++) {
                b[i*a[i].length+j] = a[i][j];
            }
        }
        return b;
    }

    // Main Method
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Do Require 1
        // create empty 2D array, ask user rows and columns
        System.out.println("Please enter the rows of the 2D array:");
        int rows = sc.nextInt();
        System.out.println("Please enter the columns of the 2D array:");
        int columns = sc.nextInt();
        int[][] array = new int[rows][columns];

        // Do Require 2
        // input the value of the 2D array(>=0)
        int input = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.println("Please enter the value of the element in row " + (i+1) + " and column " + (j+1) + ":");
                input = sc.nextInt();
                // input must be positive(>=0)
                if (input <= 0) {
                    System.out.println("ERROR: Please enter a positive number(>=0).");
                    j--;
                } else {
                    array[i][j] = input;
                }
            }
        }
        // no anymore input
        sc.close();

        // Do Require 3
        // Use Print Method to print the 2D array
        print(array);

        // Do Require 4
        // Use Print Method to print the second highest and lowest
        second(two2one(array));

        // Do Require 5
        // Use Print Method to print the 2D array after replacing
        print(replace(two2one(array),5,9));

        // That's all.
    }
}
