package ch07.sec09;

public class InstanceOfExample {
    public static void personInfo(Person person) {
        // main() 메소드에서 바로 호출하기 위해 정적 메소드 선언
        System.out.println("name : " + person.name);
        person.walk();
        // person이 참조하는 객체가 Student 타입일 경우
        // student 변수에 대입(타입 변환 발생)
        // Java 12부터 사용 가능
        if (person instanceof Student student) {
            System.out.println("student.studentNo = " + student.studentNo);
            student.study();
        }

    }

    public static void main(String[] args) {
        Person p1 = new Person("이름");
        personInfo(p1);
        // name : 이름
        // 걷다

        System.out.println();

        Person p2 = new Student("이름", 10);
        personInfo(p2);
        // name : 이름
        // 걷다
        // student.studentNo = 10
        // 공부함
    }
}
