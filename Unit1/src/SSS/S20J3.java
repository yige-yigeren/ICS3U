package SSS;

import java.util.Scanner;

public class S20J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ls = 100;
        int ws = 100;
        int ll = 0;
        int wl = 0;
        for (int i = 0; i <= n-1; i++){
            String temp = sc.next();
            int a = temp.indexOf(",");
            int l = Integer.parseInt(temp.substring(0, a));
            int w = Integer.parseInt(temp.substring(a + 1));
            if (l < ls) {
                ls = l ;
            }
            if (l > ll) {
                ll = l;
            }
            if (w < ws) {
                ws = w;
            }
            if (w > wl) {
                wl = w;
            }
        }
        sc.close();
        System.out.println((ls - 1) + "," + (ws - 1));
        System.out.println((ll + 1) + "," + (wl + 1));
    }
}
