package chap07;

import java.util.Scanner;

public class StudentScore {
    // 성적 관리 프로그램(문자열 연산)
    public static void main(String[] args) {
        int numOfStudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);
        System.out.print("학생 수? ");
        numOfStudents = in.nextInt();
        scores = new int[numOfStudents];

        System.out.println(numOfStudents + "명의 학생 성적을 입력하세요.");
        for (int i=0;i<scores.length;i++) {
            scores[i] = in.nextInt();
        }
        System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다.");
        for (int i=0;i<scores.length;i++) {
            System.out.print(scores[i] + " ");
        }
    }
}
