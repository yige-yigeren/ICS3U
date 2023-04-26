package Lesson10;

public class perfect {
    static boolean perfect (int a) {
        for (int i = 0; i< a; i++){
            if (i*i == a){
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0; i < a.length; i++){
            if (perfect(a[i])){
                System.out.println(a[i]);
            }
        }
    }
}
