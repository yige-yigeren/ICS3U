package SSS;

import java.util.Scanner;

public class S19S1 {

    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        Scanner sc = new Scanner(System.in);
        String order = sc.next();
        sc.close();
        for (int i = 0; i < order.length(); i++) {
            if (order.charAt(i) == 'H') {
                int temp = a[0][0];
                a[0][0] = a[1][0];
                a[1][0] = temp;
                temp = a[0][1];
                a[0][1] = a[1][1];
                a[1][1] = temp;
            }
            else if (order.charAt(i) == 'V') {
                int temp = a[0][0];
                a[0][0] = a[0][1];
                a[0][1] = temp;
                temp = a[1][0];
                a[1][0] = a[1][1];
                a[1][1] = temp;
            } else {
                System.out.println("Invalid input at " + (i+1));
                return;
            }
        }
        System.out.println(a[0][0] + " " + a[0][1]);
        System.out.println(a[1][0] + " " + a[1][1]);
    }
}
