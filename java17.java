package chap04;

public class chap04_1 {
    public static void main(String[] args) {
        //문자열 비교
        String strV1 = "신민철";
        String strV2 = "신민철";

        if(strV1 == strV2)
            System.out.println("strV1과 strV2는 참조가 같음");
        else
            System.out.println("strV1과 strV2는 참조가 다름");

        if(strV1.equals(strV2))
            System.out.println("strV1과 strV2는 문자열이 같음");


        String strV3 = new String("신민철");
        String strV4 = new String("신민철");

        if(strV3 == strV4)
            System.out.println("strV3과 str4는 참조가 같음");
        else
            System.out.println("strV3과 strV4는 참조가 다름");

        if (strV3.equals(strV4))
            System.out.println("strV3과 strV4는 문자열이 같음");
    }
}
