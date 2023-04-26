package Homework;

public class highest {
    static int highest (int[] a) {
        int highest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > highest) {
                highest = a[i];
            }
        }
        return highest;
    }
    public static void main (String[] args) {
        int[] a = {1,7,3,4,9,7};
        System.out.println(highest(a));
    }
}
