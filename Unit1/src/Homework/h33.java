package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class h33 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/test.txt");
        Scanner sc = new Scanner(f);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int count = 0;
        while (sc.hasNextInt()) {
            if (sc.nextInt() > num) {
                count++;
            }
        }
        sc.close();
        input.close();
        System.out.println("There are " + count + " numbers greater than " + num + " in the file.");
    }
}
