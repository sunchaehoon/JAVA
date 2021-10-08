package chap06;

public class Cone extends Circle2 {

    public Cone(double r, double h) {
        super(r, h);
    }

    @Override
    public void findArea() {
        System.out.println("원뿔의 넓이는 : " + Math.round(3.14 * r * Math.sqrt(r * r + h * h) + 3.14 * r * r));
    }

}
