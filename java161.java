package chap06;

class Vehicle1 {
    String name = "탈것";

    void whoamI() {
        System.out.println("나는 탈 것입니다.");
    }

    static void move() {
        System.out.println("이동하다.");
    }
}

class Car1 extends Vehicle1 {
    String name = "자동차";

    void whoamI() {
        System.out.println("나는 자동차이다.");
    }

    static void move() {
        System.out.println("달리다.");
    }
}

public class OverTypeDemo {
    public static void main(String[] args) {
        Vehicle1 v = new Car1();    // 자식타입 -> 부모타입
        System.out.println(v.name);
        v.whoamI();     // 오버라이딩 된 경우에는 자식 것이 찍힘
        v.move();   // static은 부모 자식 각각으로 구별

        if (v instanceof Car1) {
            Car1 c = (Car1) v;
            System.out.println(c.name);
            c.whoamI();
            c.move();
        }
    }
}
