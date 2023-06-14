package SSS;

import java.util.Scanner;

public class S23J2 {
    public static void main(String[] args) {
        int SHU = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Pepper numbers: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Please enter Pepper: ");
            String pepper = sc.nextLine();
            if (pepper.equals("Poblano")) {
                SHU = 1500;
            } else if (pepper.equals("Mirasol")) {
                SHU = 6000;
            } else if (pepper.equals("Serrano")) {
                SHU = 15500;
            } else if (pepper.equals("Cayenne")) {
                SHU = 40000;
            } else if (pepper.equals("Thai")) {
                SHU = 75000;
            } else if (pepper.equals("Habanero")) {
                SHU = 125000;
            } else {
                System.out.println("Unknown pepper!");
                i--;
                continue;
            }
        }
        sc.close();
        System.out.println(SHU);
    }
}
