package Classes;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Book> books;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void agregarLibro(Book book) {
        books.add(book);
        book.agregarPoseedor(this);
    }
}
