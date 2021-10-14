package chap06;

public class InstanceofDemo {
    public static void main(String[] args) {
        Stud s = new Stud();
        Person p = new Person();

        System.out.println(s instanceof Person);    //true
        System.out.println(p instanceof Person);    //true
        System.out.println(s instanceof Stud);    //true
        System.out.println(p instanceof Stud);    //false

        downcast(s);    // 강제 타입 변환
    }

    static void downcast(Person p) {
        if (p instanceof Stud) {
            Stud s = (Stud)p;
            System.out.println("하향 타입 변환 완료");
        }
    }
}
