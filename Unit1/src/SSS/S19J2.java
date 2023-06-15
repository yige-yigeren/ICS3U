package SSS;

import java.util.Scanner;
import java.util.ArrayList;

public class S19J2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> a = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int num = Integer.parseInt(line.split(" ")[0]);
            char symbol = line.split(" ")[1].charAt(0);
            String ans = "";
            for (int j = 0; j < num; j++) {
                ans += symbol;
            }
            a.add(ans);
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(a.get(i));
        }
    }
}
