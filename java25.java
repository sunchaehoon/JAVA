package chap04;

public class chap04_ex {
    public static void main(String[] args) {
        //for문을 이용해서 주어진 배열의 항목에서 최댓값 구하기
        int max = 0;
        int[] array = {1,5,3,8,2};

        for(int i=0;i<array.length;i++){
            if (array[i]>max)
                max = array[i];
        }
        System.out.println("max : " + max);
    }
}
