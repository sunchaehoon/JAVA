package challenge;

class Girl {
    protected String name;

    Girl(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + "는 자바 초보자이다.");
    }
}
class GoodGirl extends Girl{
    void show() {
        System.out.println(name + "는 자바를 잘 안다.");
    }
    GoodGirl(String name) {
        super(name);
    }
}
class BestGirl extends GoodGirl{
    void show() {
        System.out.println(name + "는 자바를 무지하게 잘 안다.");
    }
    BestGirl(String name) {
        super(name);
    }
}

public class GirlTest {
    public static void main(String[] args) {
//        Girl g1 = new Girl();
//        Girl g2 = new GoodGirl();
//        GoodGirl gg = new BestGirl();
//
//        g2.show();    //부모타입이 Girl인데 Girl 클래스에는 show() 메서드가 없다.
//        gg.show();

        Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};

        for (Girl g : girls)
            g.show();
    }
}
