package chap04;

public class chap04_8 {
    public static void main(String[] args) {
        //향상된 for문
        int[] scores = { 95, 71, 84, 93, 87};

        int sum = 0;
        for (int score : scores)    //for ( 타입 변수 : 배열)
            sum+=score;
        System.out.println("점수 총합 = " + sum);

        double avg = (double)sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
