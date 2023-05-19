package Lesson19;

public class electronic {
    private int model;
    private boolean battery;

    /* 
     * 'private' is modifier. Modifiers tell you who has access to the field, method, or class.
     *  Private is the most restrictive. Only this class can see it.
     *  'default' is the next most restrictive. Only classes in the same package can see it.
     */
    electronic(int m, boolean b) {
        model = m;
        battery = b;
    }
    
    void print() {
        System.out.println("Model: " + model);
        System.out.println("Battery: " + battery);
    }
}
