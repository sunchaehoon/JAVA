package chap06;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("선채훈", "050120-3******", 1206);
        System.out.println("이름 : " + s1.name);
        System.out.println("학번 : " + s1.hakbun);
        System.out.println("주민등록번호 : " + s1.ssn);

        System.out.println();

        Student s2 = new Student("손정민", "050607-3******", 1207);
        System.out.println("이름 : " + s2.name);
        System.out.println("학번 : " + s2.hakbun);
        System.out.println("주민등록번호 : " + s2.ssn);

        Student st = new Student("유재석", "123456",1234);
        st.fall();
    }
}
