package Lesson10;

public class sortArray {

    static int[] sortArray(int[] a) {
        for (int i=0; i<a.length; i++){
            for (int j=0 ; j<a.length-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main (String[] args) {
        int[] a = {8,3,2,7,8,5,10,23};
        print(sortArray(a));
    }
}
