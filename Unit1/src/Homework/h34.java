package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class h34 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        File f1 = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/test.txt");
        File f2 = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/test2.txt");
        Scanner file1 = new Scanner(f1);
        Scanner file2 = new Scanner(f2);
        int smallest = file1.nextInt();
        int smallestl = 1;
        int largest = file1.nextInt();
        int largestl = 1;
        while (file1.hasNextLine()) {
            int num = file1.nextInt();
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        while (file2.hasNextLine()) {
            int num = file1.nextInt();
            if (num > largest) {
                largest = num;
                smallestl = 2;
            }
            if (num < smallest) {
                smallest = num;
                smallestl = 2;
            }
        }
        file1.close();
        file2.close();

        System.out.println("The smallest number is " + smallest + " in file " + smallestl + ".");
        System.out.println("The largest number is " + largest + " in file " + largestl + ".");

    }
}
