package chap02;

import java.util.Scanner;

public class ex05_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<5;i++) {
            int num = sc.nextInt();
            if (num<0)
                continue;
            else
                sum += num;
        }
        System.out.println("결과 : " + sum);
    }
}
