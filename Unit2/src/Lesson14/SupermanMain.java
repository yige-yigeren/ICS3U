package Lesson14;

public class SupermanMain {
    public static void main(String[] args) {

        Superman a = new Superman("Clark Kent", "Black");

        a.print();

        a.setName("A***");


        a.print();

        System.out.println("Superman's strength is " + a.getStrength() + ". Wow! So strong!");

    }
}
