package Lesson16;

public class animal {
    //fields
    private String type;
    private animal[] eaten;
    private int size;
    private int animaleaten;

    //constructors
    animal (String t,int s) {
        type = t;
        eaten = new animal[5];
        size = s;
        animaleaten = 0;
    }

    //methods
    void print () {
        System.out.println("Type:" + type);
        System.out.println("Size:" + size);
        System.out.println("Animals eaten:" + animaleaten);
        System.out.print("Animals eaten: ");
        for (int i=0; i<eaten.length; i++) {
            if (eaten[i] != null) {
                System.out.print(eaten[i].type+"("+(i+1)+")");
            }
        }
        System.out.println();
    }
    // true if animal eaten is smaller in
    boolean caneath(animal a) {
        if (a.size < size) {
            return true;
        } else {
            return false;
        }
    }
    // eats animal and puts into array
    void eat(animal a) {
        if (animaleaten == eaten.length) {
            System.out.println("Can't eat");
            return;
        }
        if (caneath(a)) {
            for (int i=0; i<a.eaten.length; i++) {
                if (eaten[i] == null) {
                    eaten[i] = a;
                    animaleaten++;
                    break;
                }
            }
        } else {
            System.out.println("Can't eat");
        }
    }	
    

}
