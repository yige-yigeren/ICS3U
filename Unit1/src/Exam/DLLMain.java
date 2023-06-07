package Exam;

public class DLLMain {
    public static void main(String[] args) {
        SLList a  = new SLList ("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");
        

        a.print();

        System.out.println(a.length());

        System.out.println(a.search("c"));

        System.out.println(a.search("f"));

    }
}
