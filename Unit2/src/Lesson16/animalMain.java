package Lesson16;

public class animalMain {
    public static void main(String[] args) {

        animal a = new animal("lion", 1000);

        animal b = new animal("tiger", 48);

        a.print();

        a.eat(b);

        a.print();


    }
}
