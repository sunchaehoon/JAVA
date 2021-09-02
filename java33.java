package chap05;

public class Car {
    //Car 클래스 필드 선언
//    String company = "현대자동차";
//    String model = "그랜저";
//    String color = "검정";
//    int maxSpeed = 350;
//    int speed;


    //생성자의 오버로딩
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //다른 생성자를 호출해서 중복 코드 줄이기
    Car() {
    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;       //공통 실행 코드
    }
}
