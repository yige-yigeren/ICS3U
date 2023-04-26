package Lesson8;

import java.util.ArrayList;

public class aList {
    public static void main(String[] args) {

        int[] a = {1,2,3,4};
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.trimToSize();

        b.set(2, 7);
        b.remove(4);
        System.out.println(b);
        System.out.println(b.get(2));
        System.out.println(b.size());
    }
}
