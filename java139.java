package problem3;

public class Food {
    String name;
    int price;

     public Food (String name, int price) {
        this.name = name;
        this.price = price;
    }

    void print() {
        System.out.printf("name : %s, price : %d\n", name, price);
    }

    public static void main(String[] args) {
        //음식 객체 생성
        Food chicken = new Food("치킨", 18000);
        Food pizza = new Food("피자", 28000);
        Food sushi = new Food("초밥세트", 22000);

        //객체 배열에 음식 담기
        Food[] foods = {chicken, pizza, sushi};

        //모든 음식 정보 출력
        for (int i=0;i<foods.length;i++)
            foods[i].print();
    }
}
