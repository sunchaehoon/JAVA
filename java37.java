package chap02;

import java.util.Scanner;

public class ex05_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String str = sc.nextLine();
            if (str.equals("exit")) {
                System.out.println("--------종료 되었습니다--------");
                break;
            }
        }
    }
}
