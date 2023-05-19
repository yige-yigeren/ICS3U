package Lesson20;

public class change1 {

    static void sSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = min(a, i);
            changes(a, i, min);
        }
    }

    static void changes(int[] a, int b, int c) {
        int d = a[b];
        a[b] = a[c];
        a[c] = d;
    }

    static int min (int[] a, int i) {
        int b = a[i];
        int c = i;
        for (int j = i ; j < a.length; j++) {
            if (a[j] < b) {
                c = j;
                b = a[j];
            }
        }
        return c;
    }

    
    static int[] change1(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int b = a[i];
            int c = i;
            for (int j = i ; j < a.length; j++) {
                if (a[j] < b) {
                    c = j;
                    b = a[j];
                }
            }
            int d = a[i];
            a[i] = a[c];
            a[c] = d;
        }
        return a;
    }
    

    public static void main(String[] args) {
        int[] a = {9, 2, 6, 4, 1, 3, 7, 8};
        sSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
