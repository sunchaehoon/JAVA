package problem2;

class Printer {
    int numOfPapers = 0;

    public Printer(int numOfPapers) {
        this.numOfPapers += numOfPapers;
    }

    void print(int amount) {    //amount = 출력하는 양
        numOfPapers -= amount;
        System.out.println(numOfPapers);
    }

}
    public class ex01 {
        public static void main(String[] args) {
            Printer p = new Printer(100);
            p.print(70);
        }
    }
