package Homework;

public class candivide {
    static boolean div(int a, int b) {
        if (a%b == 0) {
            return true;
        }
        return false;
    }

    public static void main (String[] args) {
        System.out.println(div(10,2));
        System.out.println(div(10,3));
    }
}
