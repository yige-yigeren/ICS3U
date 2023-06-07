package Lesson26;

public class MDLL {
    mnode head; // represents the first node in the list

    MDLL (int a) {
        head = new mnode(null, a, 1, null);

    }

    void addNode(int a) {
        mnode temp = head;
        int exist = 0;
        while (temp.next != null) {
            if (temp.value == a) {
                temp.occur++;
                exist = 1;
            } 
            temp = temp.next;
        }
        if (exist == 0) {
            temp.next = new mnode (temp, a, 1, null);
        }
    }

    void print () {
        mnode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void remove (int a) {
        mnode temp = head;
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

    int total () {
        mnode temp = head;
        int total = 0;
        while (temp != null) {
            total += temp.occur;
            temp = temp.next;
        }
        return total;
    }

    int length () {
        mnode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void reverse () {
        mnode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
    }

    void combine (MDLL a) {
        mnode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = a.head;
        temp.next.prev = temp;
    }

    
}
