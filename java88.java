package chap05;

import java.util.Scanner;

class Rectangle {
    int width;
    int height;
    public int getArea() {
        return width * height;
    }
}

public class RectApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print(">> ");
        int w = sc.nextInt();
        int h = sc.nextInt();
        r.width = w;
        r.height = h;
        System.out.println("사각형의 면적은" + r.getArea());
    }
}
