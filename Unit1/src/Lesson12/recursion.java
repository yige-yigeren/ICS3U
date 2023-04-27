package Lesson12;
/*
 * recursion are methods that are recursive
 * It is a method that calls itself
 * There are two parts to a recursive method
 * - base case (thw easiest case)
 * - the recursive formula (the formula that calls itself)
 */
public class recursion {

    static int factorial(int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    static int factorial2(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * factorial2(a - 1);
        }
    }    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        System.out.println(factorial2(5));
    }
}
