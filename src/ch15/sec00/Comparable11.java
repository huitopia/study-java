package ch15.sec00;

import java.util.Objects;
import java.util.TreeSet;

public class Comparable11 {
    public static void main(String[] args) {
        TreeSet<Book11> treeSet = new TreeSet<Book11>();
        treeSet.add(new Book11("모두의 git", 7000));
        treeSet.add(new Book11("이것이 자바다", 8000));
        treeSet.add(new Book11("react", 6000));

        System.out.println("treeSet = " + treeSet);
    }
}

class Book11 implements Comparable<Book11> {
    private String title;
    private Integer price;

    public Book11(String title, Integer price) {
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
        Book11 book11 = (Book11) o;
        return Objects.equals(title, book11.title) && Objects.equals(price, book11.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Book11{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book11 o) {
//        return this.price - o.price; // 음수, 0, 양수
        return this.title.compareTo(o.title);
    }
}
