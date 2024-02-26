package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9902021230123";
        char sex = ssn.charAt(6);
        System.out.println("sex = " + sex);
        if (sex == '1' || sex == '3') {
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }
    }
}
