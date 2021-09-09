package problem;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        //키보드로 입력한 정수가 19 이상이면 '성년', 아니면 '미성년' (if~esle)
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n >= 19)
            System.out.println("성년");
        else
            System.out.println("미성년");
    }
}
