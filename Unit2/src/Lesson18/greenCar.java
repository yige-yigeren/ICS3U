package Lesson18;

public class greenCar extends car{
    private double efficiency;

    greenCar(double m, double e) {
        super(m);
        efficiency = e;
    }

    void drive(double d) {
        super.drive(d*(1-efficiency));
    }
}
