package ch08.sec00;

import java.util.NoSuchElementException;

public class Test07Example {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();

    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}

interface DataAccessObject {
    void select();

    void insert();

    void update();

    void delete();

}

class OracleDao implements DataAccessObject {
    @Override
    public void update() {
        System.out.println("oracle db에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("oracle db에서 삭제");
    }

    @Override
    public void insert() {
        System.out.println("oracle db에서 삽입");
    }

    @Override
    public void select() {
        System.out.println("oracle db에서 검색");
    }
}

class MySqlDao implements DataAccessObject {
    @Override
    public void update() {
        System.out.println("mysql db에서 수정");
    }

    @Override
    public void delete() {
        System.out.println("mysql db에서 삭제");
    }

    @Override
    public void insert() {
        System.out.println("mysql db에서 삽입");
    }

    @Override
    public void select() {
        System.out.println("mysql db에서 검색");
    }
}

