package SSS;

import java.util.Scanner;

public class S20S2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[][] a = new int[n][l];
        for (int i=0; i<n; i++) {
            for (int j=0; j<l; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}
