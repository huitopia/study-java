package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();
        // ride() 메소드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // 인터페이스 매개변수를 갖는 메소드
    public static void ride(Vehicle vehicle) {
        if (vehicle instanceof Bus bus) {
            bus.checkFare();
        }
        vehicle.run();
    }
}

interface Vehicle {
    void run();
}

class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("bus run");
    }

    public void checkFare() {
        System.out.println("cost check");
    }
}

class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("taxi run");
    }
}