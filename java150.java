package chap06;

public class Cylinder extends Circle2 {

    public Cylinder(double r, double h) {
        super(r, h);
    }

    @Override
    public void findArea() {
        System.out.println("원기둥의 넓이는 : " + (2 * r * r * 3.14 + 2 * 3.14 * r * h));
    }
}
