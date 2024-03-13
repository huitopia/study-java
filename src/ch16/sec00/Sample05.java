package ch16.sec00;

public class Sample05 {
    public static void main(String[] args) {
        MyInterface05 myInterface05_01 = (a, b) ->
                System.out.println("a를 b로 나눈 몫 출력 : " + (a / b));
        
        MyInterface05 myInterface05_02 = (a, b) ->
                System.out.println("a를 b로 나눈 후의 나머지 출력 : " + (a % b));
        myInterface05_01.method(5, 3);
        myInterface05_02.method(5, 3);
    }
}

@FunctionalInterface
interface MyInterface05 {
    void method(int a, int b);
}
