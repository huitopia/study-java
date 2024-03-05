package ch06.sec16.test15;

public class MemberService {
    boolean login(String id, String pw) {
//        if ((id == "hong") && (pw == "12345")) {
//            return true;
//        } else {
//            return false;
//        }
        boolean resultId = id.equals("hong");
        boolean resultPw = pw.equals("12345");
        if (resultId && resultPw) {
            return true;
        } else {
            return false;
        }
    }

    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
