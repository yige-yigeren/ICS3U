package SSS;
import java.util.Scanner;

public class S23J3 {
    public static void main(String[] args) {
        int[] date = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter peoples: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter date:");
            String adate = sc.nextLine();
            for (int j = 0; j < 5; j++) {
                if (adate.charAt(j) == 'Y') {
                    date[j] += 1;
                }
            }
        }
        sc.close();
        int choice = 0;
        int temp = 0;
        for (int i = 0; i < 5; i++) {
            if (date[i] > temp) {
                temp = date[i];
                choice = i+1;
            }
        }
        System.out.println(choice);
    }
}
