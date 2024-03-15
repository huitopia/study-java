package ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
    @Override
    // 타입 파라미터 P를 Home으로 대체하고 Rentable 리턴 타입이 P이기 때문에
    // 반드시 리턴 타입이 Home이 되어야 함
    public Home rent() {
        return new Home();
    }
}
