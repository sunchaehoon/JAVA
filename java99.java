package problem2;

class Line {
    int length;

    public Line(int length) {
        this.length = length;
    }
    public boolean isSameLine(Line b) {
        if (length == b.length) {
            return true;
        }
        else
            return false;
    }
}

public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));    //true
        System.out.println(a == b);    //false
    }
}
