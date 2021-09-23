package problem2;

class Triangle {
    double x;
    double y;
    public Triangle(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public double findArea() {
        return x * y;
    }
    public boolean isSameArea(Triangle a) {
        if (findArea() == a.findArea())
            return true;
        else
            return false;
    }
}

public class TriangleTest {
    public static void main(String[] args) {
//        Triangle t = new Triangle(10.0, 5.0);
//        System.out.println(t.findArea());
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
