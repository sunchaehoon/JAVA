package chap02;

public class ex05_5 {
    public static void main(String[] args) {
        int n1=10,n2=100;
        double nd1 = 5.5, nd2 = 10.5;
        int sum = sum(n1, n2);
        double sum2 = sum(nd1,nd2);
        double sum3 = sum(nd1, n1);
        System.out.println(sum2 + "\n" + sum3);
    }

    public static int sum(int a, int b){
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum += i;
        }
        return sum;
    }
    public static double sum(double a, double b){
        double sum2 = 0;
        for(double i=a;i<=b;i++){
            sum2 += i;
        }
        return sum2;
    }
    public static double sum(double a, int b){
        double sum3 = 0;
        for(double i=a;i<=b;i+=0.5){
            sum3 += i;
        }
        return sum3;
    }
}
