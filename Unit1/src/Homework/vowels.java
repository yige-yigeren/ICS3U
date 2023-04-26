package Homework;

public class vowels {
    static int vow (String a) {
        int num = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i'
            || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                num++;
            }
        }
        return num;
    }
    public static void main (String[] args) {
        System.out.println(vow("hello"));
    }
}
