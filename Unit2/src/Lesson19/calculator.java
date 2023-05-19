package Lesson19;

public class calculator extends electronic{
    
    private String model;

    calculator(int c, String m) {
        super (c, true);
        model = m;
    }

    void print() {
        super.print();
        System.out.println("Model: " + model);
    }

    static int add (int a, int b) {
        return a + b;
    }

    static int subtract (int a, int b) {
        return a - b;
    }

    static int multiply (int a, int b) {
        return a * b;
    }

    static double divide (int a, int b) {
        return (double)a / b;
    }

}
