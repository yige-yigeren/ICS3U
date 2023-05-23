package Lesson24;

public class FILOMain {
    public static void main(String[] args) {
        FILO a = new FILO(5);
        a.push(2);
        a.push(1);
        a.push(3);
        a.push(7);
        a.push(8);
        a.print();
        a.pop();
        a.print();
    }
}
