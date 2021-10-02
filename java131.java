package chap07;

public class VarArgsDemo {
    // 가변 개수 매개변수
    // 데이터 타입이 같은 가변 개수의 인수 전달 --> 메서드로 전달할 인수의 개수를 정확히 알 수 없을 때 유용
    public static void main(String[] args) {
        printSum(1, 2, 3, 4, 5);
        printSum(10, 20, 30);
        System.out.println(String.format("My score is %.1f", 99.8));
        System.out.println(String.join(", ", "one", "two", "three"));
    }

    public static void printSum(int... v) {  // 데이터타입... 변수
        int sum = 0;
        for (int i : v)
            sum += i;
        System.out.println(sum);
    }
}
