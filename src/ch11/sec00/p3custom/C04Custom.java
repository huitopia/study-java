package ch11.sec00.p3custom;

public class C04Custom {
    public static void main(String[] args) {
        try {
            method01();
        } catch (LackOfCaffeineException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method01() throws LackOfCaffeineException {
        throw new LackOfCaffeineException("카페인 부족");
    }
}

class LackOfCaffeineException extends Exception {
    LackOfCaffeineException() { // 기본 생성자

    }

    LackOfCaffeineException(String msg) { // 파라미터 받는 생성자
        super(msg);
    }
}
