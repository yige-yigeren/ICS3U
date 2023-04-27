package Lesson12;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class courses3 {
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        File f = new File ("/F:/OneDrive/OneDrive - yigeyigeren/Downloads/marks.txt");
        Scanner file = new Scanner(f);
        int[] marks = {0,0,0,0,0,0};
        while (file.hasNextLine()) {
            String code = file.nextLine();
            if(code.charAt(3) == '4') {
                int mark = Integer.parseInt(code.substring(6,code.length()));
                if (mark > marks[0]) {
                    marks[0] = mark;
                    Arrays.sort(marks);
                }
            }
        }
        file.close();
        double average = (marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[0])/6;
        System.out.println("The average of the top 6 marks is " + average + ".");
    }
}