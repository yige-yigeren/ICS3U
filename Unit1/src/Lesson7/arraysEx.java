package Lesson7;

public class arraysEx {
    public static void main(String[] args) {

        int a = 5;

        int[] b = {1,2,3,4,5};

        System.out.println(b[1]);

        int[] c = new int[5];

        c[0] = 1;

        c[1] = 2;

        c[2] = 3;

        c[3] = 4;

        c[4] = 5;

        int[] d = new int[]{1,2,3,4,5};

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

        int[] e = new int[5];

        for (int i = 0; i < e.length; i++) {
            e[i] = i + 1;
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
