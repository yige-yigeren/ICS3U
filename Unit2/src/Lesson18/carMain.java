package Lesson18;

public class carMain {
    public static void main(String[] args) {
        car c = new car(100);
        greenCar g = new greenCar(100, 0.1);
        raceCar r = new raceCar(100);
        c.print();
        g.print();
        r.print();
        c.drive(10);
        g.drive(10);
        r.drive(10);
        r.print();
        r.TurboOn();
        r.drive(10);
        r.TurboOff();
        c.print();
        g.print();
        r.print();
    }
}
