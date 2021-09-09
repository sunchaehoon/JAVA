package chap04;

class Circle {
    double radius;
    String color;

    void print() {
        System.out.println(color + "공의 반지름은 " + radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Circle Y = new Circle();
        Circle R = new Circle();
        Y.radius = 5.0;
        Y.color = "노란색";
        R.radius = 3.0;
        R.color = "빨간색";
        Y.print();
        R.print();
    }
}
