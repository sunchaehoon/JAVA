package chap2;

public class Man {
    int age;
    String name;
    boolean marry;
    int child;

    public static void main(String[] args) {
        Man p = new Man();
        p.age = 40;
        p.name = "James";
        p.marry = true;
        p.child = 3;
        System.out.println(p.age + "\n" + p.name + "\n" + p.marry + "\n" + p.child);
    }
}
