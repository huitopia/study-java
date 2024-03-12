package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car(); // Car 객체 생성
        car.run1(); // 익명 자식 객체가 대입된 필드 사용
        car.run2(); // 익명 자식 객체가 대입된 로컬변수 사용

        car.run3(new Tire() { // 익명 자식 객체가 대입된 매개변수 사용
            @Override
            void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러감");
            }
        });
    }
}

class Tire {
    void roll() {
        System.out.println("일반 타이어 굴러감");
    }
}

class Car {
    private Tire tire1 = new Tire(); // 필드에 Tire 객체 대입
    private Tire tire2 = new Tire() { // 필드에 익명 자식 객체 대입
        @Override
        void roll() {
            System.out.println("익명 자식 Tire 객체1이 굴러감");
        }
    };

    void run1() { // 메소드(필드 이용)
        tire1.roll(); // "일반 타이어 굴러감"
        tire2.roll(); // "익명 자식 Tire 객체1이 굴러감"
    }

    void run2() { // 메소드(로컬 변수 이용)
        Tire tire = new Tire() { // 로컬 변수에 익명 자식 객체 대입
            @Override
            void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러감");
            }
        };
        tire.roll();
    }

    void run3(Tire tire) { // 메소드(매개변수 이용)
        tire.roll();
    }
}
