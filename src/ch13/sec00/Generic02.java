package ch13.sec00;

public class Generic02 {
    public static void main(String[] args) {
        Box02<String> box1 = new Box02<String>();
        Box02<Integer> box2 = new Box02<Integer>();

        box1.setItem("Java");
        String item = box1.getItem();

        box2.setItem(300);
        Integer item2 = box2.getItem();
    }
}

/* generic type
 * <> : 타입 파라미터
 * 타입 파라미터 이름 작성 관습 : 대문자 한글자 <T>
 * -- 주로 쓰는 이름들
 * T : Type
 * E : Element(원소)
 * K : Key
 * V : Value
 * R : Return, Result
 * -- 여러개 사용시
 * S, U, V : T근처 알파벳
 * T1, T1
 */
class Box02<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
