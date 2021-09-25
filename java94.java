package chap2;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Order {
    String num;
    String id;
    String day;
    String name;
    String productnum;
    String deliveryadress;

    public static void main(String[] args) {
        Order o = new Order();
        o.num = "201803120001";
        o.id = "abc123";
        o.day = "2018년 3월 12일";
        o.name = "홍길순";
        o.productnum = "PD0345-12";
        o.deliveryadress = "서울시 영등포구 여의도동 20번지";
        System.out.println("주문번호 : " + o.num);
        System.out.println("주문자 아이디 : " + o.id);
        System.out.println("주문 날짜 : " + o.day);
        System.out.println("주문자 이름 : " + o.name);
        System.out.println("주문 상품 번호 : " + o.productnum);
        System.out.println("배송 주소 : " + o.deliveryadress);
    }
}
