package chap06;

public class AreaTest extends Circle2{
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Cylinder c2 = new Cylinder();
        Ball c3 = new Ball();
        Cone c4 = new Cone();
        System.out.println(c1.findArea());
        System.out.println(c2.findArea());
        System.out.println(c3.findArea());
        System.out.println(c4.findArea());
    }
}
