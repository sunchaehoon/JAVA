package chap01;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        int result = 1;     //팩토리얼 결과 값 저장
        int n = 0;      //키보드에서 입력받을 저수 저장
//        Scanner in = new Scanner(System.in);    //키보드로 정수를 입력받고 팩토리얼 값을 계산하는 코드
//        n = in.nextInt();

//        result = factorial(n);
//        System.out.println(result);
//        System.out.println("종료");

        System.out.println(factorial(3, 5));
        System.out.println(factorial(1,5));
        System.out.println(factorial(3,5));
        System.out.println(factorial(10,5));

//        while(n>0){
//            result *= n;
//            n--;
//        }

//        while(true){
//            if (n<=0)
//                break;
//            result *= n;
//            n--;
//        }
//
//        System.out.println(result);
//    }
    }
//    public static int factorial(int x){
//        int r = 1;  //팩토리얼 값을 계산하는 코드
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while(n>0){
//            r *= n;
//            n--;
//        }
//        return r;
//    }

    public static int factorial(int x, int y) {
        int r = 1;      //구간 팩토리얼 값을 계산하는 코드
        for (int i = y; i >= x; i--)
            r *= i;
        return r;
    }
}
