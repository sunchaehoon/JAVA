package problem;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        //키보드로 입력된 양의 정수 중에서 짝수만 덧셈해서 출력 (do~while)
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int sum = 0;

        while(n > 0) {
            System.out.print("양의 정수를 입력하세요 : ");
            n=sc.nextInt();
            if (n %2 ==0)
                sum += n;
        }
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    }
}
