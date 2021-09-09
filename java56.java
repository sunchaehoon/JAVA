package chap04;

public class HumanDemo {
    public static void main(String[] args) {
        human Hoon2 = new human();
        human ChanWoo = new human();

        Hoon2.name = "선채훈";
        Hoon2.height = 183.4;
        ChanWoo.name = "변찬우";
        ChanWoo.height = 165.9;

        Hoon2.dancing();
        Hoon2.singing();
        ChanWoo.dancing();
        ChanWoo.singing();
    }
}
