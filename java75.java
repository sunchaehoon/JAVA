package chap01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;

        while (cnt < 5) {
            int n = sc.nextInt();
            cnt++;
            if (n == 0)
                break;
            if (n % 2 == 0)
                continue;
            else
                sum += n;
        }
        System.out.println("종료");
        System.out.println(sum);
    }
}
