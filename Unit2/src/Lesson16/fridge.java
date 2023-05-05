package Lesson16;

public class fridge {
    //fields
    private Boolean Door;
    private int temp;
    private fridge[] foods;

    //constructors
    fridge () {
        Door = false;
        temp = 0;
        foods = new fridge[5];
    }

    //methods
    void status(){
        System.out.println("Door: " + Door);
        System.out.println("Temp: " + temp);
        System.out.print("Foods: ");
        for (int i=0; i<foods.length; i++) {
            if (foods[i] != null) {
                System.out.print(foods[i].foods+"("+(i+1)+")");
            }
        }
        System.out.println();
    }
    void opendoor() {
        Door = true;
    }
    void closedoor() {
        Door = false;
    }
    void settemp(int t) {
        temp = t;
    }
    void add(fridge a) {
        if (Door == false) {
            System.out.println("ERROR:Can't add, open door first.");
            return;
        }
        for (int i=0; i<foods.length; i++) {
            if (foods[i] == a) {
                System.out.println("Already in fridge");
                break;
            } else if (foods[i] == null) {
                foods[i] = a;
                break;
            } else if (foods.length == 5) {
                System.out.println("Can't add");
                return;
            }
        }
    }
    boolean check(fridge a) {
        if (Door == false) {
            System.out.println("ERROR:Can't check, open door first.");
            return false;
        }
        for (int i=0; i<foods.length; i++) {
            if (foods[i] == a) {
                return true;
            }
        }
        return false;
    }
    void remove(fridge a) {
        if (Door == false) {
            System.out.println("ERROR:Can't remove, open door first.");
            return;
        }
        for (int i=0; i<foods.length; i++) {
            if (foods[i] == a) {
                foods[i] = null;
                break;
            }
        }
    }
    void raise() {
        temp++;
    }

}
