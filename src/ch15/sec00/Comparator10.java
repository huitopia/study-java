package ch15.sec00;

import java.util.Objects;
import java.util.TreeSet;

public class Comparator10 {
    public static void main(String[] args) {
//        var set = new TreeSet<Book10>();
        // treeSet은 comparator 구현 안 하면 error
        // treeSet은 값이 들어오면 정렬하기 때문에 정렬할 수 있는 기준을 위해 구현해야함
        // 가격 순서
//        var set = new TreeSet<Book10>((a, b) -> a.getPrice() - b.getPrice());
        // 제목 순서
        // String은 .compareTo 사용
        var set = new TreeSet<Book10>((a, b) -> a.getTitle().compareTo(b.getTitle()));
        set.add(new Book10("이것이 자바다", 30000));
        set.add(new Book10("모두의 git", 25000));
        set.add(new Book10("react", 35000));

        System.out.println("set = " + set);

    }
}

class Book10 {
    private String title;
    private Integer price;

    public Book10(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book10 book10 = (Book10) o;
        return Objects.equals(title, book10.title) && Objects.equals(price, book10.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Book10{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
