package Homework;

public class middle {
    static String mid (String a) {
        if (a.length() % 2 == 0) {
            return a.substring(a.length()/2-1,a.length()/2+1);
        }
        return a.substring(a.length()/2,a.length()/2+1);
    }
    public static void main (String[] args) {
        System.out.print(mid("hello") + "\n");
        System.out.print(mid("test"));
    }
}
