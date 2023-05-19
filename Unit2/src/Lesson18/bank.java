package Lesson18;

public class bank {
    private static double money;
    private static double cheques;

    bank(double m, double a, double d) {
        money = m;
        cheques = 0;
    }

    void changeCheques(double a, double e) {
        money = money*e + a;
    }

    void cheques(double c) {
        cheques = cheques + 1;
    }


    static void print() {
        System.out.println("Money: " + money);
    }
}
