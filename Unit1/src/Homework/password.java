package Homework;

import java.util.Scanner;

public class password {
    static boolean pass(String a) {
        if (a.length() < 5) {
            return false;
        }
        int lenum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                lenum++;
            }
        }
        if (lenum < 2) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a password: ");
        String a = sc.nextLine();
        sc.close();
        if (pass(a)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
