package SSS;

import java.util.Scanner;

public class S20J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int begin = sc.nextInt();
        int inc = sc.nextInt();
        sc.close();
        int day = 0;
        int sum = begin;
        while (sum <= max) {
            day++;
            sum += begin*Math.pow(inc,day);
        }
        System.out.println(day);
    }
}
