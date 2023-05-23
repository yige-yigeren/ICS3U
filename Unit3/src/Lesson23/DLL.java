package Lesson23;

public class DLL {
    node2 head; // represents the first node in the list

    DLL (int a) {
        head = new node2(null, a, null);

    }

    void addNode(int a) {
        node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new node2 (temp, a, null);
    }

    void print () {
        node2 temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void remove (int a) {
        node2 temp = head;
        if (a == 0) {
            head = head.next;
            head.prev = null;
        } else {
            for (int i = 0; i < a; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            if (temp.next.next == null) {
                temp.next = null;
            } else {
                temp.next.prev = temp.prev;
                temp.next.prev = temp.prev;
            }
        }
    }

    int length () {
        node2 temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void reverse () {
        node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
    }

    void combine (DLL a) {
        node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = a.head;
        temp.next.prev = temp;
    }

    void insert (int a, int b) {
        node2 temp = head;
        //insert at the beginning
        if (a == 0) {
            head = new node2(null, b, temp);
            head.next.prev = head;
        } else {
            for (int i = 0; i < a - 1; i++) {
                temp = temp.next;
            }
            if (temp.next == null) {
                temp.next = new node2(temp, b, null);
            } else {
                temp.next = new node2(temp, b, temp.next);
                temp.next.next.prev = temp.next;
            }
        }
    }
}
