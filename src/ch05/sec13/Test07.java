package ch05.sec13;

public class Test07 {
    public static void main(String[] args) {
        //  최대 값 출력 코드
        int[] array = {1, 5, 3, 8, 2};
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        System.out.println("maxNum = " + maxNum);
    }
}
