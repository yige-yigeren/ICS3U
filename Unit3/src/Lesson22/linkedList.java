package Lesson22;

public class linkedList {
    node head; // represents the first node in the list

    linkedList(int a) {
        head = new node(a);

    }

    void addNode(int a) {
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new node (a);
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
        while (temp.next != null) {
            if (temp.value == a) {
                return true;
            }
            temp = temp.next;
        }
        // for last node
        return false;
    }

    int length () {
        node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void replace (int a, int b) {
        node temp = head;
        while (temp != null) {
            if (temp.value == a) {
                temp.value = b;
            }
            temp = temp.next;
        }

    }

    void reverse () {
        // prints out all the values in the linked list, but with the nodes reversed
        int place = 0;
        int[] temp = new int[this.length()];
        node tempNode = head;
        while (tempNode != null) {
            temp[place] = tempNode.value;
            tempNode = tempNode.next;
            place++;
        }
        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.println(temp[i]);
        }
    }

    int[] toArray () {
        int place = 0;
        int[] temp = new int[length()];
        node tempNode = head;
        while (tempNode != null) {
            temp[place] = tempNode.value;
            tempNode = tempNode.next;
            place++;
        }
        return temp;
    }

    void remove (int a) {
        node temp = head;
        while (temp.value == a) {
            head = temp.next;
            temp = head;
        }
        while (temp.next != null) {
            while (temp.next != null && temp.next.value == a) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
            if (temp == null) {
                break;
            }
        }
        
    }

    void insert (int a, int b) {
        node temp = head;
        if (a == 0) {
            node temp2 = new node(b);
            temp2.next = head;
            head = temp2;
        }
        else {
            for (int i = 0; i < a - 1; i++) {
                temp = temp.next;
            }
            node temp2 = new node(b);
            temp2.next = temp.next;
            temp.next = temp2;
        }
    }
}
