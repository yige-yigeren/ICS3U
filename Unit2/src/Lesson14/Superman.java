package Lesson14;

/*
 * Classes have 3 parts:
 * 1.Fields - variables associated with the object
 * 2.Constructors - how you create an object
 * 3.Methods - what the object can do
 */

public class Superman {
    
    //Fields

    private String name;
    private int strength;
    private String hair;

    //Constructors

    Superman (String n, String h) {
        name = n;
        hair = h;
        strength = 100;
    }

    // Methods
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Hair: " + hair);
        System.out.println("Strength: " + strength);
    }

    //mutator method (setter)
    void setName (String n) {
        name = n;
    }
    void setHair (String h) {
        hair = h;
    }
    void setStrength (int s) {
        strength = s;
    }
    void setAll (String n, String h, int s) {
        name = n;
        hair = h;
        strength = s;
    }

    //accessor method (getter)
    String getName () {
        return name;
    }

    String getHair () {
        return hair;
    }

    int getStrength () {
        return strength;
    }
}
