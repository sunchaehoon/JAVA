package chap04;

public class chap04_4 {
    public static void main(String[] args) {
        //배열의 length 필드
        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i=0;i<scores.length;i++)
            sum += scores[i];
        System.out.println("총합 : " + sum);

        double avg = (double)sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
