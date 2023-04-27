package Lesson12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class courses2 {
    public static void main (String[] args) throws FileNotFoundException {
        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/marks.txt");

        Scanner file = new Scanner(f);

        String code = "";
        int count = 0;

        while (file.hasNextLine()) {
            code = file.nextLine();
            if(code.charAt(3) == '3' || code.charAt(3) == '4') {
                if (code.charAt(0) == 'C') {
                    count++;
                }
                else if (code.charAt(0) == 'E') {
                    count++;
                }
                else if (code.charAt(0) == 'M') {
                    count++;
                }
                else if (code.charAt(0) == 'S') {
                    count++;
                }
            }
        }
        System.out.println("There are " + count + "English, math, science and computers courses in the file.");
        file.close();
    }
}
