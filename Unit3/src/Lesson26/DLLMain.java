package Lesson26;

public class DLLMain {
    public static void main(String[] args) {
        MDLL a  = new MDLL(5);
        a.addNode(2);
        a.addNode(1);
        a.addNode(3);
        a.addNode(7);
        a.addNode(8);
        
        MDLL b = new MDLL(5);
        b.addNode(2);
        b.addNode(1);
        b.addNode(3);
        b.addNode(7);
        b.addNode(8);
        a.combine(b);
        a.print();
        System.out.println(a.total());

    }
}
