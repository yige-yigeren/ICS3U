package Lesson18;

public class car {
    private double mileage;

    car(double m) {
        mileage = m;
    }

    void print() {
        System.out.println("Mileage: " + mileage);
    }

    void drive(double d) {
        mileage = mileage - d;
    }

    void fillUp(double f) {
        mileage = mileage + f;
    }


}
