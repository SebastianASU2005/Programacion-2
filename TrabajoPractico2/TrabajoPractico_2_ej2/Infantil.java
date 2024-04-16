package TrabajoPractico2.TrabajoPractico_2_ej2;

public class Infantil extends Libro {
    private int edadRecomendada;

    public Infantil(String titulo, String autor, int yearDePublicacion, boolean prestado, int edadRecomendada) {
        super(titulo, autor, yearDePublicacion, prestado);
        this.edadRecomendada = edadRecomendada;
    }

}
