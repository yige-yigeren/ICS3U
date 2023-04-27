package Homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class h29 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/test.txt");
        Scanner sc = new Scanner(f);
        System.out.println("Please enter a letter");
        String letter = sc.nextLine();

        while (sc.hasNextLine()) {
            if (sc.nextLine().startsWith(letter)) {
                System.out.println(sc.nextLine());
            }
        }

    }
}
