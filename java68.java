package problem;

import java.util.Scanner;

public class ex10 {
    public static boolean isPrime(int num) {
        boolean ss = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                ss = false;
        }
        return ss;
    }
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        if (isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else
            System.out.println(num + "는 소수가 아닙니다.");
    }
}
