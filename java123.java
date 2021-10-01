package chap07;

public class String2Demo {
    public static void main(String[] args) {
        String s1 = "Hi, Java!";
        String s2 = new String("Hi, Java!");
        String s3 = "Hi, Code!";
        String s4 = "Hi, java!";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));// equalsIgnoreCase -> 주어진 문자열과 현재 문자열을 대소문자 구분 없이 비교

        System.out.println(s1.compareTo(s3));// compare To -> 문자열을 사전 순으로 비교하여 정수값 반환.
        System.out.println(s1.compareToIgnoreCase(s4));
        System.out.println(s3.compareTo(s4));   // 'C' - 'j' = -39df
        System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));
    }
}
