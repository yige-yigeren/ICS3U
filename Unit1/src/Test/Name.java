package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            String name = sc.next();
            names.add(name);
        }
        System.out.println("Name list: ");
        for (int j = 0; j < n; j++) {
            String temp = names.get(0);
            int count = 0;
            for (int i = 1; i < names.size(); i++) {
                if (names.get(i).length() > temp.length()) {
                    for (int k = 0; k < temp.length(); k++) {
                        int temp1 = names.get(i).charAt(k);
                        int temp2 = temp.charAt(k);
                        if (names.get(i).charAt(k) < 91) {
                            temp1 = names.get(i).charAt(k) + 32;
                        } else {
                            temp1 = names.get(i).charAt(k);
                        }
                        if (temp.charAt(k) < 91) {
                            temp2 = temp.charAt(k) + 32;
                        } else {
                            temp2 = temp.charAt(k);
                        }
                        if (temp1 < temp2) {
                            temp = names.get(i);
                            count = i;
                            break;
                        }
                    }
                }
            }
            System.out.println(temp);
            names.remove(count);
        }
        sc.close();
    }
}
