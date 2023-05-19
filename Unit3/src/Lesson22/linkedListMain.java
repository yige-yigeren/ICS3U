package Lesson22;

public class linkedListMain {
    public static void main(String[] args) {
        linkedList a  = new linkedList(5);
        a.addNode(2);
        a.addNode(1);
        a.addNode(3);

        a.print();

        System.out.println(a.search(7));
        System.out.println(a.length());
        a.reverse();
    }
}
