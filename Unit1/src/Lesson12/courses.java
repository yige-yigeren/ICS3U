package Lesson12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class courses {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub

        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/marks.txt");

        Scanner file = new Scanner(f);

        String code = "";
        int count = 0;
        while (file.hasNextLine()) {

            code = file.nextLine();
            if(code.charAt(3) == '3' || code.charAt(3) == '4') {
                count++;
            }

        }
        System.out.println("There are " + count + " courses in the file.");
    }
}
