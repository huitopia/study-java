package ch15.sec00;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Equals08 {
    public static void main(String[] args) {
        Set<Book08> set = new HashSet<>();
        set.add(new Book08("이것이 자바다"));
        set.add(new Book08("자바의 정석"));
        set.add(new Book08("클린코드"));
        set.add(new Book08("모두의 git"));
        set.add(new Book08("이것이 자바다"));
        /* new로 생성하면 번지수가 달라 내용이 같아도 다른 객체라
         * equals, hashCode method 정의 전의 set.size()는 5
         * equals, hashCode method 정의 후의 set.size()는 4
         * */
        System.out.println("set.size() = " + set.size());

    }
}

class Book08 {
    private String title;

    public Book08(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book08{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book08 book08 = (Book08) o;
        return Objects.equals(title, book08.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}