package Lesson24;

public class heap {
    
    static int factorial (int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * factorial(a-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
