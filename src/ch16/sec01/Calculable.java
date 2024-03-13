package ch16.sec01;

// @FunctionalInterface: 인터페이스가 함수임을 보장
@FunctionalInterface
public interface Calculable {
    void calculate(int x, int y);
}
