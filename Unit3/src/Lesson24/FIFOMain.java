package Lesson24;

public class FIFOMain {
    
    public static void main(String[] args) {
        FIFO a = new FIFO(5);
        a.push(2);
        a.push(1);
        a.push(3);
        a.push(7);
        a.push(8);
        a.print();
        System.out.println(a.search(3));
        System.out.println(a.count());
        a.pop();
        a.print();

    }
}
