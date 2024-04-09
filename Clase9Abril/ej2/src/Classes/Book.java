package Classes;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Person> owners;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
        this.owners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public void setOwners(List<Person> owners) {
        this.owners = owners;
    }
    public void agregarPoseedor(Person per) {
        owners.add(per);
    }
}
