package SSS;

import java.util.ArrayList;
import java.util.Scanner;

public class S20S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>  a = new ArrayList<Integer>();
        ArrayList<Integer>  b = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) {
            int b1 = sc.nextInt();
            b.add(b1);
            int a1 = sc.nextInt();
            a.add(a1);
        }
        sc.close();
        double least = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (b.get(i) == b.get(j)) continue;
                double speed = Math.abs((double)(a.get(i) - a.get(j)) / (b.get(i) - b.get(j)));
                if (speed > least) {
                    least = speed;
                }
            }
        }
        System.out.println(least);
    }
}
