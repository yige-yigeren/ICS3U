package Lesson24;

import java.util.ArrayList;

public class FILO {
    
    ArrayList<Integer> List;

    // input first, last out
    FILO (int a) {
        List = new ArrayList<Integer>();
        List.add(a);
    }

    void push(int a) {
        List.add(a);
    }

    void pop () {
        List.remove(List.size()-1);
    }

    void print () {
        for (int i = 0; i < List.size(); i++) {
            System.out.print(List.get(i) + " ");
        }
        System.out.println();
    }

    boolean search (int a) {
        for (int i = 0; i < List.size(); i++) {
            if (List.get(i) == a) {
                return true;
            }
        }
        return false;
    }

    int count () {
        return List.size();
    }
}
