package ch11.sec00.p2throw;

import java.sql.SQLException;

public class C07Throw {
    public static void main(String[] args) {
        try {
            method01();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void method01() throws ClassNotFoundException, SQLException {
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
