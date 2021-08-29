package chap02;

public class chap02_2 {
    public static void main(String[] args) {
        //증감 연산자
        int x = 10;
        int y = 10;
        int z;

        System.out.println("-----------------");
        x++;    // x = 10
        ++x;    // x = 12
        System.out.println("x=" + x);

        System.out.println("-----------------");
        y--;    // y = 10
        --y;    // y = 8
        System.out.println("y=" + y);

        System.out.println("-----------------");
        z = x++;    // z = 12, x = 12
        System.out.println("z=" + z);   // x = 13
        System.out.println("x=" + x);

        System.out.println("-----------------");
        z = ++x;    //z = 14, x = 14
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("-----------------");
        z = ++x + y++;  // z = 23, x = 15, y = 8
        System.out.println("y=" + y);   //y = 9
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
