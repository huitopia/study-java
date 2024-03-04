package ch06.sec08.exam03;

public class Car {
    //  필드 선언
    int gas;

    //  리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
    void setGas(int gas) {
        this.gas = gas;
    }

    //  리턴값이 boolean인 메소드로 gas 필드값이 0이면 false, 아니면 true
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("no gas");
            //  false 리턴하고 메소드 종료
            return false;
        }
        System.out.println("ok gas");
        //  true 리턴하고 메소드 종료
        return true;
    }

    //  리턴값이 없는 메소드로 gas 필드값이 0이면 return 문으로 메소드 종료
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("gas = " + gas);
                gas -= 1;
            } else {
                System.out.println("gas = " + gas);
                return;
            }
        }
    }
}
