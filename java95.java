package chap2;

public class Person {
    // 생성자 사용하기

    String name;
    float height;
    float weight;

    public Person() { } //디폴트 생성자

    public Person(String pname) {
        name = pname;
    }
    public Person(String pname, float pheight, float pweight) {
        name = pname;
        height = pheight;
        weight = pweight;
    }
}
