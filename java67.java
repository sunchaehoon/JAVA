package problem;

import java.util.Scanner;

public class ex08 {
    private static void printStar(int i){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int j=0;j<k;j++)
            System.out.print("*");
    }

    public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            printStar(i);
            System.out.println();
        }
    }
}
