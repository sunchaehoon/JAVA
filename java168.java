package sangsi;

class car {
    String carname;
    String color = "검정색";

    void show1() {
        System.out.println("나의 트럭은 " + color + "이다.");
    }

    void show2() {
        System.out.println(carname + "는 톤을 실을 수 없다");
    }
}

public class TruckTest {
    public static void main(String[] args) {
        Truck mytruck = new Truck();
        mytruck.carname = "프런티어";
        mytruck.ton = 3;
        mytruck.show1();
        mytruck.show2();
    }
}
