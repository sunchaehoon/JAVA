package chap07;

public class Person {
    // final 필드 선언과 초기화
    // final 필드 --> 한 번 값이 저장되면 변경할 수 없음
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
