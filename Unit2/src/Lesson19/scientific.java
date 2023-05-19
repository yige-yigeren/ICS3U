package Lesson19;

public class scientific extends calculator {
    private boolean programmable;

    scientific(int c, String m,boolean p) {
        super(c, m);
        programmable = p;
    }

    void print() {
        super.print();
        System.out.println("Programmable: " + programmable);
    }

    static int powerOf5 (double a) {
        return (int) Math.pow(5.0, a);
    }

}
