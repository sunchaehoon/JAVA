package problem3;

public class Account {
    private String ano;
    private String owner;
    private int balance;

    public Account(String ano, String owner,int balance) {
        this.ano = ano;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAno() {
        return ano;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void transfer(Account target, int amount) {
        if (balance <= 0)
            System.out.println("잔액이 없습니다.");
        else
            balance -= amount;
            target.balance += amount;
    }
}
