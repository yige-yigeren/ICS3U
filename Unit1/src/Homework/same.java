package Homework;

public class same {
    static int same(int[] a, int[] b) {
        int samenum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    samenum++;
                }
            }
        }
        return samenum;
    }
    public static void main (String[] args) {
        int[] a = {1,2,3,8,5};
        int[] b = {1,2,3,4,9};
        System.out.println(same(a,b));
    }
}
