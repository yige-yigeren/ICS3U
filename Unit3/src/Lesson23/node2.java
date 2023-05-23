package Lesson23;

public class node2 {
    
    node2 prev;
    int value;
    node2 next;

    node2(node2 p, int v, node2 n) {
        prev = p;
        value = v;
        next = n;
    }

}
