package ch12.sec11.exam03;

/* 리소스 경로 얻기 */
public class GetResourceExample {
    public static void main(String[] args) {
        Class clazz = Car.class;

        String path1 = clazz.getResource("1.jpg").getPath();
        String path2 = clazz.getResource("2.jpg").getPath();

        System.out.println("path1 = " + path1);
        System.out.println("path2 = " + path2);
    }
}

class Car {
}
