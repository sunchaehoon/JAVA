package chap04;

public class chap04_6 {
    public static void main(String[] args) {
        //배열 String[] 문자열 비교 --> equals(), 객체의 번지 비교 --> '=='
        //객체를 참조하는 배열
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);    //true
        System.out.println(strArray[0] == strArray[2]);    //false(strArray[2] -> new String
        System.out.println(strArray[0].equals(strArray[2]));    //true(문자열은 같음)
    }
}
