package chap06;

class Person {  //부모 클래스
    String name = "사람";

    void whoami() {
        System.out.println("나는 사람이다.");
    }

}

class Stud extends Person {     //자식 클래스
    int number = 7;

    void work() {
        System.out.println("나는 공부한다.");
    }
}

public class UpcastDemo {
    public static void main(String[] args) {
        //Person p = new Stud();  // 자동 형변환

        //Person p;
        //p = new Stud();

        Person p;
        Stud s = new Stud();
        p = s;

        //p.number = 1;   //자식 클래스가 부모 클래스로 형변환 되버림 --> 자식 클래스 접근 불가
        //p.work();

        p.whoami();
    }
}
