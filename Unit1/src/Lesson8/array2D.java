package Lesson8;

public class array2D {
    public static void main(String[] args) {

        int[] a = {4, 5, 6, 7, 8, 9, 10};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // b[0][0] = 1, b[0][1] = 2, b[0][2] = 3, b[1][0] = 4, b[1][1] = 5, b[1][2] = 6, b[2][0] = 7, b[2][1] = 8, b[2][2] = 9
        int[][] c = {   {1,2},
                        {3,4},
                        {5,6},
                        {7,8}
                    };

        for (int i =0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        int d[][] = new int[4][2];
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j] = i * 10 + j + 1;
            }
        }
        for (int i =0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        int e[][] = new int[2][3];

        e[0][0] = 1;
        e[0][1] = 2;
        e[0][2] = 3;
        e[1][0] = 4;
        e[1][1] = 5;
        e[1][2] = 6;
        for (int i =0; i < e.length; i++) {
            for (int j = 0; j < e[i].length; j++) {
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }
    }
}
