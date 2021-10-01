package chap07;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hi, Java!";
        String s2 = "Hi, Java!";
        String s3 = new String("Hi, Java!");    // new String --> 새로운 객체를 생성함.
        String s4 = new String("Hi, Java!");

        // == 나 != 연산자는 두 문자열의 내용을 비교하는것이 아니라동일한 객체인지 검사한다.
        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s3 == s4 -> " + (s3 == s4));

        s1 = s3;
        System.out.println("s1 == s3 -> " + (s1 == s3));
    }
}
