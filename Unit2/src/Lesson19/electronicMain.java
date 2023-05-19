package Lesson19;

import Lesson18.car;

public class electronicMain {
    public static void main(String[] args) {
        
        electronic a = new electronic(123, true);

        calculator b = new calculator(456, "Sharp");

        scientific c = new scientific(789, "Casio", true);

        c.print();
        System.out.println(c.powerOf5(2));
        System.out.println(calculator.add(2, 3));

        b.print();
        System.out.println(b.multiply(4, 6));

        car d = new car(500);
    }
}
