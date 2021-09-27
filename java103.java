package problem2;

class Dice {

    public int roll() {
        int face = (int) (Math.random() * 6) + 1;
        return face;
    }
}


public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
