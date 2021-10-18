package practice;

class A {
    A() {
        System.out.println("A의 인수 0의 생성자입니다.");
    }
    A(int a) {
        System.out.println("A의 인수 1의 생성자입니다.");
    }
}
class B extends A {
    B() {
        System.out.println("B의 인수 0의 생성자입니다.");
    }
    B(int b) {
        super(b);
        System.out.println("B의 인수 1의 생성자입니다.");
    }
}

public class SampleP3 {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(10);
    }
}
