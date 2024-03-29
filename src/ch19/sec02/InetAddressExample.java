package ch19.sec02;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());

            /*
             * getByName() : 도메인 이름으로 등록된 단 하나의 IP 주소
             * getAllByName() : 등록된 모든 IP 주소를 배열로
             * getHostAddress() : InetAddress 객체에서 IP 주소를 얻기 위해 사용하는 메소드
             */
            InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
            for (InetAddress remote : iaArr) {
                System.out.println("www.naver.com IP 주소: " + remote.getHostAddress());
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
