package justpractice;

import java.util.Scanner;

public class StudentScore {
    public enum grade {
      // 열거 타입
        A("최우수"),
        B("우수"),
        C("보통"),
        D("미흡"),
        E("탈락");

        private final String grade;

        grade(String grade) {
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        int numOfstudents = 0;
        int[] scores;
        Scanner in = new Scanner(System.in);

        System.out.print("학생 수? ");
        numOfstudents = in.nextInt();
        scores = new int[numOfstudents];
        System.out.println(numOfstudents + "명의 학생 성적을 입력하세요.");
        for (int i = 0; i < scores.length; i++)
            scores[i] = in.nextInt();
        System.out.println(numOfstudents + "명의 학생 성적은 다음과 같습니다.");
        for (int i : scores)
            System.out.print(i + " ");
        System.out.println();
        for (int i = 0; i < numOfstudents; i++)
            if (scores[i] >= 90)
                System.out.println(i + 1 + "번 학생의 등급은 " + grade.A.grade + "입니다.");
            else if (scores[i] >= 80)
                System.out.println(i + 1 + "번 학생의 등급은 " + grade.B.grade + "입니다.");
            else if (scores[i] >= 70)
                System.out.println(i + 1 + "번 학생의 등급은 " + grade.C.grade + "입니다.");
            else if (scores[i] >= 60)
                System.out.println(i + 1 + "번 학생의 등급은 " + grade.D.grade + "입니다.");
            else
                System.out.println(i + 1 + "번 학생의 등급은 " + grade.E.grade + "입니다.");
    }
}
