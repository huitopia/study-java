package ch02.sec06;
public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        System.out.println(name); // 홍길동

        String str = "나는 \"집에\"가고 싶습니다.";
        System.out.println(str); // 나는 "집에"가고 싶습니다.

        str = "번호\t이름\t직업";
        System.out.println(str); // 번호 이름 직업

        // 텍스트 블록 문법
        String str1 = "" + "{\n" + "\t\"id\":\"winter\",\n" + "}";
        String str2 = """
                {
                    "id":"winter",
                }
                """;
        System.out.println(str1);
        System.out.println(str2);
    }
}
