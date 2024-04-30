package Classes;

import java.util.ArrayList;
import java.util.List;

public class Facility {
    private String category;
    private String location;
    private String name;
    private String type;
    private List<Test> tests;

    public Facility() {
    }

    public Facility(String category, String location, String name, String type) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        this.tests = new ArrayList<>();
    }
    public void agregarPrueba(Test test) {
        tests.add(test);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

}
