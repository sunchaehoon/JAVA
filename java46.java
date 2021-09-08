package chap06;
public class Car {
    //return문

    //Field
    int gas;

    //Constructor

    //Method
    void setGas(int gas) {
        this.gas = gas;     //리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    }
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while(true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량:" + gas + ")");
                gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas잔량:" + gas + ")");
                return;     //메소드 실행 종료
            }
        }
    }
}
