package Lesson22;

public class node {
    int value; // value stired in the node
    node next; // points to the next node
    
    public node(int value, node next) {
        value = value;
        next = next;
    }
    
    // constructor for a node with no next node
    node (int v) {
        value = v;
        next = null;
    }

    
    public static void main(String[] args) {
        
    }
}
