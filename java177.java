package practice;

public class MyPoint {
    //필드
    private int x;
    private int y;

    //메소드
    public void setX(int px) {
        if (x >= 0 & x <= 100)
            this.x = px;
    }
    public void setY(int py) {
        if (y >= 0 & y <= 100)
            this.y = py;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    //생성자
    public MyPoint() {
        x = 0;
        y = 0;
    }
    public MyPoint(int px, int py) {
        if (x >= 0 & x <= 100 & y >= 0 & y <= 100) {
            x = px;
            y = py;
        }
    }
}
