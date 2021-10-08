package chap06;

import chap06.Circle2;
import chap06.Cylinder;
import chap06.Ball;
import chap06.Cone;

public class AreaTest {

    public static void main(String[] args) {
        Circle2 c1 = new Circle2(10, 5);
        Ball b = new Ball(10, 5);
        Cylinder c2 = new Cylinder(10, 5);
        Cone c3 = new Cone(10, 5);

        c1.findArea();
        b.findArea();
        c2.findArea();
        c3.findArea();
    }
}
