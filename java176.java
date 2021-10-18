package practice;

class Car {
    public static int sum = 0;

    private int num;
    private double gas;

    public Car() {
        num = 0;
        gas = 0.0; sum++;
        System.out.println("자동차가 만들어졌습니다.");
    }
    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "으로 바꾸었습니다.");
    }
    public void showSum() {
        System.out.println("자동차는 모두 " + sum + "대 있습니다.");
        show();
    }
    public void show() {
        System.out.println("차량 번호 " + num + " 연료 양 " + gas + "인 자동차입니다.");
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.setCar(1234, 20.5);
        c.show();
    }
}
