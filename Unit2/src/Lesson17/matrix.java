package Lesson17;

public class matrix {
    static int row;
    static int col;
    private int[][] matrix;

    matrix (int r, int c,int[][] m) {
        row = r;
        col = c;
        matrix = m;
    }
    void print(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    void setnum(int r, int c, int n) {
        matrix[r][c] = n;
    }
    int getnum(int r, int c) {
        return matrix[r][c];
    }
    

}
