package ch13.sec00;

public class Test03 {
    public static void main(String[] args) {
        Container03<String, String> container1 = new Container03<String, String>();
        container1.set("성이름", "도적");
        String name1 = container1.getKey();
        String job = container1.getValue();

        Container03<String, Integer> container2 = new Container03<String, Integer>();
        /* var로 생성 가능
         * var container2 = new Container03<String, Integer>();
         */
        container2.set("성이름", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();

        System.out.println("name1 = " + name1);
        System.out.println("job = " + job);
        System.out.println("name2 = " + name2);
        System.out.println("age = " + age);
    }
}

class Container03<K, V> {
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void set(K key, V value) {
        this.value = value;
        this.key = key;
    }


}