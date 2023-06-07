package Lesson26;

public class mnode {
    
    mnode prev;
    int value;
    int occur;
    mnode next;

    mnode(mnode p, int v, int o, mnode n) {
        prev = p;
        value = v;
        occur = o;
        next = n;
    }

}
