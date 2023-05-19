package Lesson21;

public class change2 {

    static void iSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = a[0];
            int place = 0;
            for (int j = 0 ; j < a.length - i; j++) {
                if (a[j] < min) {
                    min = a[j];
                    place = j;
                }
            }
            for (int j = place; j < a.length - 1 ; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = min;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,2,5,6,3,4,7,8,5,3,5,8};
        iSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
