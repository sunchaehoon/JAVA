package chap02;

public class ex05_4 {
    public static void main(String[] args) {
        int sum = Sum();
        System.out.println(sum);
    }

    public static int Sum() {
        int sum = 0;
        for (int i = 1; i < 11; i++)
            sum += i;
        return sum;
    }
}
