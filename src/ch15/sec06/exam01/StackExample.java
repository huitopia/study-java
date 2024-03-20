package ch15.sec06.exam01;


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Stack collection 생성
        Stack<Coin> coinBox = new Stack<Coin>();
        // 값 넣기
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(10));
        coinBox.push(new Coin(500));

        coinBox.add(new Coin(10));

        System.out.println("coinBox.size() = " + coinBox.size());

        while (!coinBox.isEmpty()) { // 비어있지 않다면 반복
            Coin coin = coinBox.pop();
            System.out.println("꺼낸 동전 : " + coin.getValue() + "원");
        }

        System.out.println("coinBox.size() = " + coinBox.size());

    }
}
