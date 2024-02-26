package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        //  길이 3인 배열
        String[] oldArray = {"java", "array", "copy"};
        //  길이 5인 배열을 새로 생성
        String[] newArray = new String[5];
        // 배열 항목 복사
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("newArray = " + newArray[i]);
        }
    }
}
