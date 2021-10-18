package choosang;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone();        abstract라서 new 쓸 수 없음

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
