package chap06;

public class Cylinder extends Circle2{
    @Override
    public double findArea() {
        double area = (2*r*r*pi)+2*r*pi*h;
        return area;
    }
}
