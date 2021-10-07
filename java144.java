package chap06;

public class Ball extends Circle2{
    @Override
    public double findArea() {
        double area = 4*r*r*pi;
        return area;
    }
}
