package chap2;

public class PersonTest {
    public static void main(String[] args) {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.F;

        Person personLee = new Person("이순신, 175, 75");
    }
}
