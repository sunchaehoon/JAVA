package chap2;

public class chap2_01 {
    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("나누는 수는 0이 될 수 없습니다");
            return; //함수 수행 종료
        }
        else {
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result + " 입니다.");
        }
    }

    public static void main(String[] args) {
//      divide(18,3);
        divide(18,0);
    }
}
