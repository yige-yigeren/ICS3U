package Homework;

public class quad {
    static double[] quad (int a, int b, int c) {
        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("ERROR: The delta is negative.");
            return null;
        } else if (delta == 0) {
            double[] ans = new double[1];
            ans[0] = -b/(2*a);
            return ans;
        } else {
            double[] ans = new double[2];
            ans[0] = (-b + Math.sqrt(delta))/(2*a);
            ans[1] = (-b - Math.sqrt(delta))/(2*a);
            return ans;
        }
    }
    static String print (double[] a) {
        String ans = "";
        for (int i = 0; i < a.length; i++) {
            ans += a[i] + " ";
        }
        return ans;
    }
    public static void main (String[] args) {
        double[] ans = quad(9,2,1);
        System.out.println(print(ans));
    }
}
