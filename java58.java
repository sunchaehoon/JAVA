package chap04;

public class PhoneDemo{
    public static void main(String[] args) {
        Phone Galaxy = new Phone();
        Phone iPhone = new Phone();

        Galaxy.model = "GalaxyS8";
        Galaxy.value = 100;
        iPhone.model = "iPhone10";
        iPhone.value = 200;

        Galaxy.print();
        iPhone.print();
    }
}
