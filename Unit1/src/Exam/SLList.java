package Exam;

public class SLList {
    // Name: Mr. Lei
    // Course Code: ICS3U
    // Date: 2023-05-29
    // For Test 3 - Searching, Sorting and Data Structures

    // fields
    sNode head;

    // constructor
    SLList(String a) {
        head = new sNode(a, null);
    }

    // methods
    void print () {
        sNode temp = head;
        while (temp != null) {
            System.out.print(temp.word + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void add(String a) {
        sNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new sNode(a, null);
    }

    int length () {
        sNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    boolean search(String a) {
        sNode temp = head;
        while (temp != null) {
            if (temp.word.equals(a)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}
