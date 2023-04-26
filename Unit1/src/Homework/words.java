package Homework;

public class words {
    static int words(String a) {
        int num = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > 64 && a.charAt(i) < 91 || a.charAt(i) > 96 && a.charAt(i) < 123) {
            num++;
            }
        }
        return num;
    }
        public static void main (String[] args) {
            String a = "Hello, my name is maysum.";
            System.out.println(words(a));
    }
}
