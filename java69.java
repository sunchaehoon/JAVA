package chap05;

public class Ball extends Circle {
    private String color;

    public Ball(String color) {
        this.color = color;
    }

    public void findArea() {
        System.out.println(color + "공이다");
    }

    public void findVolume() {
        System.out.println("부피는 4/3* 넓이는  (π * r * r * r)이다.");
    }
}
