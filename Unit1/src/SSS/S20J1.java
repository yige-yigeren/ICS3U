package SSS;

import java.util.Scanner;

public class S20J1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        sc.close();
        int sum = s + 2*m + 3*l;
        if (sum >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
