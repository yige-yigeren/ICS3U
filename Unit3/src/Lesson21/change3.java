package Lesson21;

public class change3 {
    
    static int[][] part(int[] a) {
        int[][] parted = new int[a.length/2 + a.length%2][2];
        for (int i = 0; i < a.length; i++) {
            if (i < a.length/2) {
                parted[i][0] = a[i];
            } else {
                parted[i - a.length/2][1] = a[i];
            }
        }
        return parted;
    }

    static int[] resort(int[] a, int[] b) {
        int ai = 0, bi = 0;
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length + b.length; i++) {
            if (a[ai] > b[bi]) {
                c[i] = b[bi];
                bi++;
            } else {
                c[i] = a[ai];
                ai++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8};
        int[][] parted = part(a);
        int[] c = resort(parted[0], parted[1]);
        parted = part(b);
        int[] d = resort(parted[0], parted[1]);
        int[] e = resort(c, d);
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i] + " ");
        }
    }
}
