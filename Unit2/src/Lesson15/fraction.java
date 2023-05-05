package Lesson15;

public class fraction {
    
    //fields
    int num;
    int denom;

    //constructors
    fraction (int n, int d) {
        num = n;
        denom = d;
    }

    //methods
    void print () {
        System.out.println(num + "/" + denom);
    }
    void munltiply () {
        int whole = num / denom;
        int remainder = num % denom;
        System.out.println(whole + " " + remainder + "/" + denom);

    }
    fraction add(fraction a) {
        int top = num * a.denom + denom * a.num;
        int bottom = denom * a.denom;
        fraction b = new fraction(top, bottom);
        return b;
    }
    fraction multiply(fraction a) {
        int top = num * a.num;
        int bottom = denom * a.denom;
        fraction b = new fraction(top, bottom);
        return b;
    }
    fraction divide(fraction a) {
        int top = num * a.denom;
        int bottom = denom * a.num;
        fraction b = new fraction(top, bottom);
        return b;
    }
    fraction subtract(fraction a) {
        int top = num * a.denom - denom * a.num;
        int bottom = denom * a.denom;
        fraction b = new fraction(top, bottom);
        return b;
    }
    fraction inverse (fraction a) {
        int top = a.denom;
        int bottom = a.num;
        fraction b = new fraction(top, bottom);
        return b;
    }
    fraction reduce () {
        int value = 1;
        for (int i=this.num; i>0; i--) {
            if (this.num % i == 0 && this.denom % i == 0) {
                value = i;
                break;
            }
        }
        fraction b = new fraction(this.num/value, this.denom/value);
        return b;
    }

}
