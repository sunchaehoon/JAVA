package Test;

import chap06.One;

public class Three {
    void print() {
        One o = new One();
        //System.out.println(o.secret);   // private 불가능
        //System.out.println(o.roommate);
        //System.out.println(o.child);
        System.out.println(o.anybody);
    }
}
