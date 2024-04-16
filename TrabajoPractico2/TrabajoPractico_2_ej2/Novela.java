package TrabajoPractico2.TrabajoPractico_2_ej2;

public class Novela extends Libro{
    private String genero;

    public Novela(String titulo, String autor, int yearDePublicacion, boolean prestado, String genero) {
        super(titulo, autor, yearDePublicacion, prestado);
        this.genero = genero;
    }
}
