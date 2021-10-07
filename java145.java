package chap06;

public class Cone extends Circle2{
    @Override
    public double findArea() {
        double area = pi*r*Math.sqrt(r*r + h*h) + r*r*pi;
        return area;
    }
}
