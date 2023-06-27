package Exam;

import java.util.Scanner;


public class MMain {
    public static void main(String[] args) {
        // Name: Mr. Lei
        // Course Code: ICS3U
        // Date: 2023-06-22
        Scanner sc = new Scanner(System.in);
        // create a list of minions
        System.out.print("Enter number of minions: ");
        int n = sc.nextInt();
        // first minion
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Minion a = new Minion(name, age);
        MList list = new MList(a);
        // other minions
        for (int i = 1; i < n; i++) {
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter age: ");
            age = sc.nextInt();
            a = new Minion(name, age);
            list.add(a);
        }
        sc.close();
        // print minions
        System.out.println("Minions:");
        list.print();
        // speak minions
        System.out.println("Minions speak:");
        MNode temp = list.head;
        temp.min.speak();
        temp = temp.next;
        while (temp != null) {
            temp.min.speak();
            temp = temp.next;
        }
        // sort minions by age
        list.sort();
        System.out.println("Sorted minions:");
        list.print();
    }
}
