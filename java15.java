package chap03;

public class chap03_ex {
    public static void main(String[] args) {
        // for문을 사용한 별찍기
//        for(int i=1;i<=4;i++){
////            for(int j=1;j<=i;j++){
////                System.out.print("*");
////            }
////            System.out.println();
////        }

        for(int i=1;i<=4;i++){
            for(int j=4;j>0;j--){
                if(i<j)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
