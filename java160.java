package chap06;

class Sportscar extends Car1 {
    void whoamI() {
        System.out.println("나는 스포츠카다.");
    }
}

public class PolymorDemo {
    public static void main(String[] args) {
        Vehicle1[] v = new Vehicle1[2];
        v[0] = new Car1();
        v[1] = new Sportscar();
        for (Vehicle1 i:v) {
            i.whoamI();
        }
    }
}
