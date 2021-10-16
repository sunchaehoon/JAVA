package sangsi;

public class Truck extends car{
    String carname = "프런티어";
    int ton = 3;
    String color = "검정색";

    void show2() {
        System.out.println(carname + "은 " + ton + "톤을 실을 수 있다.");
    }
}
