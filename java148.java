package chap06;

public class Ball extends Circle2 {

    public Ball(double r, double h) {
        super(r, h);
    }

    @Override
    public void findArea() {
        System.out.println("공의 넓이는 : " + (4 * r * r * 3.14));
    }

}
