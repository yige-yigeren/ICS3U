package Lesson18;

public class animalMain {
    public static void main(String[] args) {
        animal a = new animal("Bob", 4);
        tiger t = new tiger("Tony", 4);
        a.print();
        t.print();
        t.eat("chicken");
        t.eat("cow");
        t.eat("pig");
        t.print();
    }
    
}
