package Lesson18;

/**
 * tiger is  a subclass of animal
 * super class: animal
 * sub class: tiger
 */

public class tiger extends animal {
    //fields - do not put in the fields from the super class
    private String[] eaten;

    //constructor - you must use the word super. Order matters

    tiger(String n, int l) {
        super(n, l);
        eaten = new String[3];
    }

    void print() {
        super.print();
        System.out.print("Eaten: ");
        for (int i=0; i<eaten.length; i++) {
            System.out.print(eaten[i] + " ");
        }
        System.out.println();
    }

    void eat (String a) {
        for (int i=0; i<eaten.length; i++) {
            if (eaten[i] == null) {
                eaten[i] = a;
                break;
            }
        }
    }

    
}
