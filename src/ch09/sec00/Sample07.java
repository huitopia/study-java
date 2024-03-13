package ch09.sec00;

import java.util.Arrays;
import java.util.Random;

public class Sample07 {
    public static void main(String[] args) {
        Game rpsGame = new Game() {
            @Override
            public void play() {
                String[] arr = {"바위", "가위", "보"};
                int num = (int) (Math.random() * 3) + 1;
                num = num - 1;
                System.out.println(arr[num]);
            }
        };
        rpsGame.play(); // "가위", "바위", "보" 중 하나 출력

        Game lottoGame = new Game() {
            @Override
            public void play() {
                int[] arr = new int[6];
                int cnt = 1;
                for (int x = 0; x < cnt; x++) {
                    int num = (int) (Math.random() * 45) + 1;
                    arr[x] = num;
                    for (int y = 0; y < x + 1; y++) {
                        if (arr[x] == arr[y]) {
                        }
                    }
                    cnt++;
                }
                System.out.println(Arrays.toString(arr));
            }
        };
        lottoGame.play();
    }
}

interface Game {
    void play();
}

/*
 *
 * */