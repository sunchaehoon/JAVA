package chap02;

import java.util.Scanner;

public class chap02_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수: ");
        double v1 = sc.nextDouble();
        System.out.print("두 번째 수: ");
        double v2 = sc.nextDouble();
        System.out.println("---------------");
        double result = v1 / v2;
        if (v2 == 0 | v2 == 0.0)
            System.out.println("결과:무한대");
        else
            System.out.println("결과:" + result);
    }
}
