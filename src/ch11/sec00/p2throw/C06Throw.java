package ch11.sec00.p2throw;

import java.sql.SQLException;

public class C06Throw {
    public static void main(String[] args) throws Exception {
        method01();
    }

    public static void method01() throws Exception {
        boolean b1 = true;
        boolean b2 = true;

        if (b1) {
            throw new ClassNotFoundException();
        }
        if (b2) {
            throw new SQLException();
        }

    }
}
