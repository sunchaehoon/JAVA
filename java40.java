package chap02;

public class ex05_6 {
    public static void main(String[] args) {
        echo("안녕", 3);
    }

    private static void echo(String a, int cnt) {
        for(int i=0;i<cnt;i++){
            System.out.println(a);
        }
    }
}
