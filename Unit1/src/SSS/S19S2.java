package SSS;

import java.util.ArrayList;
import java.util.Scanner;

public class S19S2 {
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
    private static int[] find(int num) {
        int a = 0;
        int b = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                int temp = num*2 - i;
                for (int j = 2; j <= temp; j++) {
                    if (isPrime(j)) {
                        if (i + j == num*2) {
                            a = i;
                            b = j;
                            break;
                        }
                    }
                }
            }
        }
        int[] ans = {a, b};
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer>  a = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            int a1 = sc.nextInt();
            a.add(a1);
        }
        sc.close();
        for (int i=0; i<n; i++) {
            int temp = a.get(i);
            int[] ans = find(temp);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
