package SSS;

import java.util.Scanner;

public class S23J1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Package: ");
        int pkg = input.nextInt();
        System.out.println("Enter obstacle: ");
        int obs = input.nextInt();
        int count = 50 * pkg - 10 * obs;
        if (pkg > obs) {
            count += 500;
        }
        System.out.println("Total: " + count);
        input.close();
    }
}
