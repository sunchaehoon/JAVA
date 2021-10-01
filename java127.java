package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();  // ArrayList<참조타입> 참조변수
        int data;
        int sum = 0;

        while ((data = in.nextInt()) >= 0)  // 키보드에서 입력된 값이 음수가 아닐 때까지 반복
            scores.add(data);   // 데이터를 동적 배열에 추가한다.

        for (int i=0;i<scores.size();i++)
            sum += scores.get(i);   // 동적 배열의 i번째 원소를 가져온다.

        System.out.println("평균 = " + (double)sum / scores.size()); // scores/size() -> 동적 배열의 크기를 나타냄.
    }
}
