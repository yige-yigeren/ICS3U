package Lesson4;

import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your mark: ");

        int mark = sc.nextInt();

        if (mark >= 80 && mark <= 100) {
            System.out.println("A");
        } else if (mark >= 70 && mark < 80) {
            System.out.println("B");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("C");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("D");
        } else {
            System.out.println("You failed :(");
        }
        // java if 结构遵循只执行第一个符合条件的
    } 
}
