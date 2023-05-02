package Lesson15;

public class fractionMain {
    public static void main(String[] args) {

        fraction a = new fraction(4, 8);

        fraction b = new fraction(3, 4);

        a.print();

        a.munltiply();

        a.reduce().print();


        b.print();
    }
}
