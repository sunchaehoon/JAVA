package problem3;

public class MinerTest {
    public static void main(String[] args) {
        Miner m1 = new Miner();
        Miner m2 = new Miner();
        m1.name = "말런";
        m2.name = "글로리아";
        m1.mine(3);
        m2.mine(2);
        m1.print();
        m2.print();
    }
}
     class Miner {
        String name;
        int coins;

        public void mine(int n) {
            this.coins = n;
        }

        public void print() {
            System.out.printf("name : %s, coins : %d\n", name, coins);
        }
    }
