package chap06;

public class People {
    String name;
    String ssn;

    public People(String name, String ssn) {
        super();
        this.name = name;
        this.ssn = ssn;
    }

    // 메서드 오바라이딩
    void fall() {
        System.out.println("나는 사람입니다.");
    }
}
