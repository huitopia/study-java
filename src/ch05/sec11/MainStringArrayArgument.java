package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("프로그램 입력 값 부족");
            //  프로그램 강제 종료
            System.exit(0);
        }
        //  데이터 얻기
        String strNum1 = args[0];
        String strNum2 = args[1];
        //   문자열 정수 변환
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
