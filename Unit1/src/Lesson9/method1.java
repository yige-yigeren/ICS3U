package Lesson9;

public class method1 {
    // put the method here

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    static int multiply(int a, int b) {
        int answer = a*b; 
        return answer;
    }
    static double average(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            // sum = sum + a[i];
            sum += a[i];
        }
        double average = (double)sum/a.length;
        return average;
    }
    static boolean has (String a, char b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                return true;
            }
        }
        return false;
    }
    // this is an overloaded method
    // the method name is the same, but the parameter is different
    static void print (int[][] q) {
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.print(q[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        int[] a= {1,2,3,4,5};
        int[] b= {1,2,3,4,5};
        int[] c= {6,7,8,9,10};
        print(b);
        print(c);
        System.out.println(multiply(2,3));
        System.out.println(average(a));
        System.out.println(has("hello",'l'));
        System.out.println(has("hello",'a'));
        int[][] d = {{1,2,3},{4,5,6},{7,8,9}};
        print(d);
        int[][][] e = {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};
    }
}
