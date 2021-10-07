package problem3;

public class BankApplication {
    // 객체 생성(a, b 2개)
    public static void main(String[] args) {
        Account a = new Account("123-45", "김철수", 10000);
        Account b = new Account("567-89", "박영희", 10000);

        System.out.println(a.getAno() + "  " + a.getOwner() + "  " + a.getBalance());
        System.out.println(b.getAno() + "  " + b.getOwner() + "  " + b.getBalance());

        a.transfer(b, 3000);
        System.out.println("계좌 송금후");

        System.out.println(a.getAno() + "  " + a.getOwner() + "  " + a.getBalance());
        System.out.println(b.getAno() + "  " + b.getOwner() + "  " + b.getBalance());
    }
}
