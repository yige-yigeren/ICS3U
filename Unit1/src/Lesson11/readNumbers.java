package Lesson11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/test.txt");

        Scanner sc = new Scanner(f);
        
        int count = 0;
        int num = 0;
        int sum = 0;

        while (sc.hasNextLine()) {

            num = sc.nextInt();
            if(num>=80) {
                count++;
                sum += num;
            }

        }
        sc.close();

        System.out.println("There are " + count + " numbers in the file.");
        System.out.println("The sum of the numbers is " + sum + ".");
    }
}
