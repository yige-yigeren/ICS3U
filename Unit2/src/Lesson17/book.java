package Lesson17;

public class book {
    
    // fields
    private String name;
    private String type;
    private int pages;
    private int times;

    // constructors
    book(String n, String t, int p) {
        name = n;
        type = t;
        pages = p;
        times = 0;
    }
    // overloaded constructor
    book(String n, int p, int t) {
        name = n;
        type = "Children";
        pages = p;
        times = t;
    }

    // methods
    void read(int p) {
        times++;
    }

    static int howMany(book[] a, String b) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i].type.equals(b)) {
                count++;
            }
        }
        return count;
    }

    void print() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Pages: " + pages);
        System.out.println("Times Read: " + times);
    }


}
