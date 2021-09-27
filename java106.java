package chap06;

public class DmCellPhoneTest {
    public static void main(String[] args) {
        DmCellPhone dm = new DmCellPhone("자바폰", "검정색", 10);

        System.out.println(dm.model);
        System.out.println(dm.color);
        System.out.println(dm.channel);

        dm.powerOn();
        dm.bell();
        dm.sendVoice("여보세요");
        dm.receiveVoice("안녕하세요 ~ 저는 유재석인데요");
        dm.sendVoice("아 ~ 네 반갑습니다.");
        dm.hangUp();

        dm.turnOnDmb();
        dm.changeChannel(12);
        dm.turnOffDmb();
    }
}
