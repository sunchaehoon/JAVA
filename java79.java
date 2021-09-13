package chap02;

class Triangle {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double findArea() {
        return base * height / 2;
    }

    String isSameArea(Triangle t) {
        if (t.findArea() == findArea())
            return "넓이 같음";
        else
            return "넓이 다름";
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
//        System.out.println(t.findArea());
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 5.0);
        System.out.println(t1.isSameArea(t2));  //넓이 같음
        System.out.println(t1.isSameArea(t3));  //넓이 다름
    }
}
