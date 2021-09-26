package problem2;

class Complex {
    double a;
    double b;

    public Complex(double x) {
        this.a = x;
    }

    public Complex(double x, double y) {
        this.a = x;
        this.b = y;
    }

    public void print() {
        System.out.printf("%.1f + %.1fi", a, b);
        System.out.println();
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
