package Exam;

public class iPhone extends Phone{
    // iPhone class private field of iPhone will be int data(how much data they have)
    private int data = 0;

    // constructor
    iPhone (int p, int d) {
        super(p);
        this.data = d;
    }

    // methods
    public void print() {
        super.print();
        System.out.println("Data: " + data);
    }

}
