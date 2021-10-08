package chap06;

public class Circle2 {
    double r;
    double h;
    public Circle2 (double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void findArea() {
        System.out.println("원의 넓이는 : " + r*r*3.14);
    }
}
