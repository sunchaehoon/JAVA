package chap07;

public class MainArgumentDemo {
    // 메인 메서드의 매개변수 전달
    public static void main(String[] args) {
        if (args.length == 2) {
            int i = Integer.parseInt(args[1]);  // args[1]을 정수로 변환
            nPrintln(args[0], i);
        } else
            System.out.println("어이쿠!");
    }

    public static void nPrintln(String s, int n) {
        for (int i=0;i<n;i++)
            System.out.println(s);
    }
}
