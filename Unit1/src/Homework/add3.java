package Homework;

public class add3 {
    static int[] add (int[]a, int[]b, int[]c) {
        if (a.length != b.length || a.length != c.length) {
            System.out.println("ERROR: The length of the array must be the same.");
            return null;
        }
        int[] answer = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            answer[i] = a[i] + b[i] + c[i];
        }
        return answer;
    }
    public static void main (String[] args) {
        int[] a = {1,2,3,4,5,7};
        int[] b = {1,2,8,4,5};
        int[] c = {1,2,3,4,5};
        int[] answer = add(a,b,c);
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
