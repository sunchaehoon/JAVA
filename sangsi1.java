package sangsi;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        System.out.println("------------- " + dan + "단 -------------");
        System.out.println();
        for (int i=1;i<=9;i++) {
            System.out.println(dan + " X " + i + " = " + dan * i);
        }
    }
}
