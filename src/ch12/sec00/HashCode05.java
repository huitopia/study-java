package ch12.sec00;

public class HashCode05 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        o1.hashCode();
        o2.hashCode();

        int h1 = o1.hashCode();
        int h2 = o2.hashCode();
        int h3 = o3.hashCode();

        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
        System.out.println("h3 = " + h3);

    }
}
