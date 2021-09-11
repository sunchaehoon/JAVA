package problem;

public class ex05 {
    public static void main(String[] args) {
        //각 변의 길이 합이 20 이하이며 각 변의 길이가 정수인 직각 삼각형의 모든 변 구하기
        int count = 0;
        for (int a = 1; a < 18; a++) {
            for (int b = 1; b < 18; b++) {
                for (int c = 1; c < 18; c++) {
                    if (a * a + b * b == c * c & (a + b + c <= 20) & (a < b)) {
                        count++;
                        System.out.printf("%d, %d, %d\n", a, b, c);
                    }
                }
            }
        }
        System.out.printf("피타고라스 정의 성립하는 직각삼각형은 %d개 입니다.\n", count);
    }
}
