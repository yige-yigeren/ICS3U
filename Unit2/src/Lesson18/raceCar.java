package Lesson18;

public class raceCar extends car{
    private boolean turbo;

    raceCar(double m) {
        super(m);
        turbo = false;
    }

    void TurboOn() {
        turbo = true;
    }

    void TurboOff() {
        turbo = false;
    }
    
    void drive(double d) {
        if (turbo) {
            super.drive(d*1.5);
        } else {
            super.drive(d);
        }
    }
}
