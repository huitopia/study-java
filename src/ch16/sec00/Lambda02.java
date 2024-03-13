package ch16.sec00;

public class Lambda02 {
    public static void main(String[] args) {
        /* Lambda :
        functional interface(추상 메소드가 하나인 인터페이스)의
        익명 클래스의 객체 생성코드를 간단히 한 것 */
        MyInterface02 myInterface02 = (int a, int b) -> {
            System.out.println("Lambda02.");
        };
    }
}

// @FunctionalInterface annotation
// : 마크된 인터페이스가 추상 메소드가 하나인지 컴파일러가 검사
@FunctionalInterface
interface MyInterface02 {
    void method1(int a, int b);
}

