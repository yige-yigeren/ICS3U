package Homework;

public class norepeats {
    static int[] norepeats (int[] a) {
        int[] b = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    break;
                }
                if (j == a.length - 1) {
                    b[count] = a[i];
                    count++;
                }
            }
        }
        int[] c = new int[count];
        for (int i = 0; i < count; i++) {
            c[i] = b[i];
        }
        return c;
    }
    static String print (int[] a) {
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            ans += a[i] + " ";
        }
        return ans;
    }
    public static void main (String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        System.out.println(print(norepeats(a)));
    }
}
