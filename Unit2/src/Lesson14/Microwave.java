package Lesson14;

public class Microwave {
    
    //fields
    private String color;
    private boolean isOn;
    private String[] food;

    //constructors
    Microwave (String c, boolean i, String f) {
        color = c;
        isOn = i;
        food = new String[3];
    }

    //methods
    void print() {
        System.out.println("Color: " + color);
        System.out.println("Is it on?: " + isOn);
        System.out.print("Food: ");
        if (food.length != 3) {
            System.out.print("Food array is not the correct size!");
        } else {
            for (int i = 0; i < food.length; i++) {
                if (food[i] != null) {
                    System.out.print(food[i] + " ");
                }
            }
        System.out.println();
        }
    }

    //mutator methods (setters)

    void setColor (String c) {
        color = c;
    }

    void Open (boolean i) {
        isOn = i;
    }


    void setFood (String f) {
        if (isOn == true) {
            for (int i = 0; i < food.length; i++) {
                if (food[i] == null) {
                    food[i] = f;
                    break;
                }
            }
        } else {
            System.out.println("You can't put food in a microwave that isn't on!");
        }
    }
}