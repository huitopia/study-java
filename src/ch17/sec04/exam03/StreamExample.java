package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        // 첫 번째 매개값은 시작 수, 두 번째 매개값은 끝 수
        // 끝 수를 포함하지 않으면 range, 포함하면 rangeClosed
        // .range(0, 5) = 0,1,2,3,4
        // .rangeClosed(0, 5) = 0,1,2,3,4,5
        IntStream intStream = IntStream.rangeClosed(1, 5);
        intStream.forEach(a -> sum += a);
        System.out.println("sum = " + sum);

    }
}
