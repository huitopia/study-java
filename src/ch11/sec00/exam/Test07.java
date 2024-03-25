package ch11.sec00.exam;

public class Test07 {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void login(String id, String password) throws WrongPasswordException, NotExistIDException {
        if (!id.equals("blue")) {
            throw new NotExistIDException(id + " 아이디가 존재하지 않습니다.");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException(id + "의 패스워드가 틀립니다.");
        }
    }
}

class NotExistIDException extends Exception {
    public NotExistIDException() {
    }

    public NotExistIDException(String msg) {
        super(msg);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String msg) {
        super(msg);
    }
}
