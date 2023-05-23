package Lesson24;

public class FIFO {
    
    node head;

    FIFO (int a) {
        head = new node(a, null);
    }

    void push(int a) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new node (a, null);
    }

    void pop () {
        head = head.next;
    }

    void print () {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    boolean search (int a) {
        node temp = head;
        while (temp != null) {
            if (temp.value == a) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    int count () {
        int counter = 0;
        node temp = head;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        return counter;
    }

    

}
