package chap04;

import java.util.Scanner;

public class chap04_ex3 {
    public static void main(String[] args) {
        //키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택 > ");

            int selectNo = Integer.parseInt(scanner.next());

            if (selectNo == 1){
                System.out.print("학생수 > ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            }
            else if (selectNo == 2) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "] > ");
                    scores[i] = Integer.parseInt(scanner.next());
                }
            }
            else if (selectNo == 3){
                for(int i=0;i<scores.length;i++)
                    System.out.println("scores[" + i + "] > " + scores[i]);
            }
            else if (selectNo == 4){
                int max = 0, sum = 0;
                double avg = 0;
                for (int i=0;i<scores.length;i++) {
                    if (scores[i] > max) {
                        max = scores[i];
                    }
                    sum += scores[i];
                }
                avg = (float) sum / scores.length;
                System.out.println("최고 점수 : " + max);
                System.out.println("평균 점수 : " + avg);
            }
            else if (selectNo == 5)
                run = false;
        }
        System.out.println("시스템 종료");
    }
}
