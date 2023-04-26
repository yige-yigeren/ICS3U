package Homework;

public class sameChar {
    static boolean sameChar (String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String[] args) {
        System.out.println(sameChar("hello", "hello"));
        System.out.println(sameChar("cgb", "hella"));
    }
}
