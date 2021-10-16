package sangsi;

public class NumOfCount {
    public static void main(String[] args) {
        int num[] = {1, 9, 3, 2, 4, 3, 2, 9, 1, 5};
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " : ");
            for (int i = 0; i < 10; i++) {
                if (num[i] == j)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
