package SSS;

import java.util.Scanner;

public class S19J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int applesScore = 0;
        for (int i = 3; i > 0; i--) {
            applesScore += sc.nextInt() * i;
        }
        int bananasScore = 0;
        for (int i = 3; i > 0; i--) {
            bananasScore += sc.nextInt() * i;
        }
        sc.close();
        if (applesScore > bananasScore) {
            System.out.println("A");
        } else if (bananasScore > applesScore) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
