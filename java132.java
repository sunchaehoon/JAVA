package chap07;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArrayDemo {
    // 객체의 배열
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];   // 5개의 Circle 객체를 참조할 변수

        for (int i=0;i< circles.length;i++) {
            circles[i] = new Circle(i+1.0);
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n",
                    circles[i].radius, circles[i].findArea());
        }
    }
}
