package chap04;

public class chap04_7 {
    public static void main(String[] args) {
        //배열 복사

        //for문으로 배열 복사
//        int[] oldIntArray = {1, 2, 3};
//        int[] newIntArray = new int[5];
//
//        for (int i=0;i<oldIntArray.length;i++)
//            newIntArray[i] = oldIntArray[i];
//
//        for (int i=0;i< newIntArray.length;i++)
//            System.out.print(newIntArray[i] + ", ");

        //System.arraycopy()로 배열 복사
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i=0;i< newStrArray.length;i++)
            System.out.print(newStrArray[i] + ", ");
    }
}
