package Lesson11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
    public static void main (String[] args) throws FileNotFoundException {
        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/test.txt");

        Scanner sc = new Scanner(f);

        int count = 0;
        while (sc.hasNextLine()) {
            String name = sc.nextLine(); // gets name and moves cursor to next line
            System.out.println(name);
            count++;
        }
        sc.close();
        
        System.out.println("There are " + count + " lines in the file.");

    }
}
