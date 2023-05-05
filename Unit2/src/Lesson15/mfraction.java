package Lesson15;

public class mfraction {
    private int whole;
    private int num;
    private int denom;

    /*
     * mfraction (int aWhole; int aNum, int aDenom)
     * void print()			// prints out a fraction
     * void switch() 		// prints out the fraction in improper form
     * static mfraction add (mfraction a, mfraction b); 
     * static mfraction subtract (mfraction a, mfraction b);
     * static mfraction multiply (mfraction a, mfraction b);
     * static mfraction divide (mfraction a, mfraction b);
     */
    mfraction (int w, int n, int d) {
        whole = w;
        num = n;
        denom = d;
    }
    void print () {
        System.out.println(whole + " " + num + "/" + denom);
    }
    void switcha() {
        System.out.println((whole * denom + num) + "/" + denom);
    }
    /*
     *  static method is used when you don't need to create an object
     */
    
     mfraction reduce () {
        int value = 1;
        for (int i=num; i>0; i--) {
            if (num % i == 0 && denom % i == 0) {
                value = i;
                break;
            }
        }
        if (num > denom) {
            whole = whole + num / denom;
            num = num - (denom * (num / denom));
        }
        mfraction b = new mfraction(whole, num/value, denom/value);
        return b;
    }
    static mfraction add (mfraction a, mfraction b) {
        int num = a.num * b.denom + b.num * a.denom;
        int denom = a.denom * b.denom;
        int whole = 0;
        mfraction c = new mfraction(whole, num, denom);
        c = c.reduce();
        return c;
    }
    static mfraction multiply (mfraction a, mfraction b) {
        int num = a.num * b.num;
        int denom = a.denom * b.denom;
        int whole = 0;
        mfraction c = new mfraction(whole, num, denom);
        return c;
    }



}
