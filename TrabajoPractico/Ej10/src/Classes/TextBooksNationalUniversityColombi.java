package Classes;

public class TextBooksNationalUniversityColombi extends TextBook{
    private String faculty;

    public TextBooksNationalUniversityColombi() {
    }

    public TextBooksNationalUniversityColombi(String title, String author, int price, String course, String faculty) {
        super(title, author, price, course);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void mostrardatos() {
        super.mostrardatos();
        System.out.println("Facultad= "+getFaculty());
    }
}
