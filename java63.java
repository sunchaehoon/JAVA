package problem;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("철수 : ");
        String gbb = sc.nextLine();
        System.out.print("영희 : ");
        String gbb2 = sc.nextLine();

        if (gbb.equals("r") & gbb2.equals("s") | gbb.equals("s") & gbb2.equals("p") | gbb.equals("p") & gbb2.equals("r"))
            System.out.println("철수 승");
        else if (gbb.equals("r") & gbb2.equals("p") | gbb.equals("s") & gbb2.equals("r") | gbb.equals("p") & gbb2.equals("s"))
            System.out.println("영희 승");
        else
            System.out.println("비김");
    }
}
