package Lesson14;

public class MicrowaveMain {
    public static void main(String[] args) {
        Microwave a = new Microwave("White", false, "Pizza");

        a.print();

        a.Open(true);
        a.setFood("Pizza");
        a.setFood("coffee");
        a.setFood("popcorn");
        a.setFood("beef");

        a.print();
    }
}
