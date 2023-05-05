package Lesson18;

public class animal {
    private String name;
    private int legs;

    animal(String n, int l) {
        name = n;
        legs = l;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Legs: " + legs);
    }

    void yell() {
        System.out.println("I am an animal!");
    }

}
