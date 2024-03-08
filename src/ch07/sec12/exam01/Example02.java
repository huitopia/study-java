package ch07.sec12.exam01;

public class Example02 {
    public static void main(String[] args) {
        Age year = new Year(31, 4); // 나이, 몇년생
        year.printAge();
        printDesc(year);
    }

    public static void printDesc(Object o) {
        System.out.println(o.toString());

    }
}

abstract class Age {
    public abstract void printAge();
}

class Year extends Age {
    public int x;
    public int y;

    public Year(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public void printAge() {
        int result = getResult();
        System.out.println(result);
    }

    @Override
    public String toString() {
        int result = getResult();
        return STR."\{y}살 어리면 \{result}년도에 태어났습니다.";
    }

    private int getResult() {
        int result = (2024 - (x - y) + 1);
        return result;
    }
}