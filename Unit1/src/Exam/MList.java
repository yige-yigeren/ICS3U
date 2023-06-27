package Exam;

import java.util.*;

public class MList {
    MNode head;

    public MList(Minion first) {
        head = new MNode(first);
        head.next = null;
    }

    // add a minion to the end of the list
    void add(Minion a) {
        MNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new MNode(a);
        temp.next.next = null;
    }

    // print all minions in the list
    void print() {
        MNode temp = head;
        temp.min.info();
        temp = temp.next;
        while (temp != null) {
            System.out.print(" / ");
            temp.min.info();
            temp = temp.next;
        }
        System.out.println();
    }

    // sort the list by age
    void sort() {
        // create a list of store minions
        List<Minion> minions = new ArrayList<>();
        MNode temp = head;
        while (temp != null) {
            minions.add(temp.min);
            temp = temp.next;
        }
        // use Collections.sort() to sort the list
        Collections.sort(minions, Comparator.comparingInt(Minion::getAge));
        // create a new list of minions
        head = new MNode(minions.get(0));
        temp = head;
        for (int i = 1; i < minions.size(); i++) {
            temp.next = new MNode(minions.get(i));
            temp = temp.next;
        }
    }
}
