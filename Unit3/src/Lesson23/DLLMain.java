package Lesson23;

public class DLLMain {
    public static void main(String[] args) {
        DLL a  = new DLL(5);
        a.addNode(2);
        a.addNode(1);
        a.addNode(3);
        a.addNode(7);
        a.addNode(8);
        
        DLL b = new DLL(5);
        b.addNode(2);
        b.addNode(1);
        b.addNode(3);
        b.addNode(7);
        b.addNode(8);
        a.combine(b);
        a.print();

    }
}
