package ch12.sec11.exam02;

import java.lang.reflect.*;

/* 멤버 정보 얻기 */
public class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "("); // 생성자의 이름을 문자열로 반환
            Class[] parameterTypes = constructor.getParameterTypes();
            printParameters(parameterTypes);
            System.out.println(")");
        }
        System.out.println();

        System.out.println("[필드 정보]");
        // Field 클래스 또는 인터페이스의 단일 필드에 대한 정보와 동적 메소드 제공
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // getType(): Class 객체가 나타내는 필드에 대해 선언된 유형을 식별하는 객체 반환
            // getName(): 이 객체가 나타내는 필드의 이름을 반환
            System.out.print(field.getType() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            // 객체가 나타내는 method의 이름을 Method로 반환
            System.out.print(method.getName() + "(");
            Class[] parameterTypes = method.getParameterTypes();
            printParameters(parameterTypes);
            System.out.println(")");
        }

    }

    /* 생성자 및 메소드의 매개변수 정보를 출력 */
    private static void printParameters(Class[] parameterTypes) {
        for (int i = 0; i < parameterTypes.length; i++) {
            System.out.print(parameterTypes[i].getName());
            if (i < (parameterTypes.length - 1)) {
                System.out.print(",");
            }
        }
    }
}

class Car {
    private String model;
    private String owner;

    public Car() {
    }

    public Car(String model, String owner) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
