package chap02;

import java.util.Scanner;

public class chap02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int v1 = 1;
//        int v2 = 2;
//        int v3 = 3;
//        int result = v1 + v2 * v3;  //곱셈 계산 후 덧셈 계산
//        System.out.println(result);

        //삼항 연산자
//        System.out.println("숫자 입력: ");
//        int b = sc.nextInt();
//        String gh = (b%2==0) ? "짝수" : "홀수";
//        System.out.println(gh);

        int score = 85;
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
