package Homework;

public class one2two {
    static int[][] oneArraytotwo(int[] a, int b, int c){
        int[][] new2d = new int[b][c];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                new2d[i][j] = a[i * c + j];
            }
        }
        return new2d;
    }
    public static void main (String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[][] new2d = oneArraytotwo(a,3,4);
        System.out.println(new2d[0][0] + " " + new2d[0][1] + " " + new2d[0][2] + " " + new2d[0][3]);
        System.out.println(new2d[1][0] + " " + new2d[1][1] + " " + new2d[1][2] + " " + new2d[1][3]);
        System.out.println(new2d[2][0] + " " + new2d[2][1] + " " + new2d[2][2] + " " + new2d[2][3]);
    }
}
