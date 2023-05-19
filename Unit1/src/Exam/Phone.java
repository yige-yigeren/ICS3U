package Exam;

public class Phone {
    // iPhone class is subclass of T2Main class
    // fields
    private int pNum = 0;
    private int calls = 0;
    String[] called = new String[20];
    String[] received = new String[20];

    // constructor
    public Phone (int pNum ) {
        this.pNum = pNum;
    }

    // methods
    // void print
    public void print () {
        System.out.println("Phone Number: " + pNum);
        System.out.println("Number of Calls: " + calls);
        System.out.println("Called: ");
        for (int i = 0; i < calls; i++) {
            if (called[i] != null) {
                System.out.println(called[i]);
            }
        }
    }

    // void call
    public void call (String a) {
        if (pNum == 20) {
            System.out.println("You can't call any more");
            return;
        } 
        called[calls] = a;
        calls++;
    }
    
    // void receive  
    public void receive (String a) {
        if (pNum == 20) {
            System.out.println("You can't receive any more");
            return;
        } 
        received[calls] = a;
        calls++;
    }

    // ststic void friends
    public static void friends (Phone a) {
        System.out.println("Friends:");
        String[] friends = new String[20];
        int count = 0;
        for (int i = 0; i < a.calls; i++) {
            for (int j = 0; j < a.received.length; j++) {
                if (a.called[i] == a.received[j]) {
                    for (int k = 0; k < friends.length; k++) {
                        if (friends[k] == a.called[i]) {
                            friends[count] = a.called[i];
                            System.out.println(a.called[i]);
                            count++;
                        }
                    }
                }
            }
        }
    }
}
