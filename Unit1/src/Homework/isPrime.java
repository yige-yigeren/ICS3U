package Homework;

public class isPrime {
    static boolean isPrime(int a) {
        for (int i = 2; i < (a/3+1); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(3231));

    }
}
