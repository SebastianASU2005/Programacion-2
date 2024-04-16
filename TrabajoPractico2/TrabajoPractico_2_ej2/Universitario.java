package TrabajoPractico2.TrabajoPractico_2_ej2;

public class Universitario extends Libro{
    private String carrera;

    public Universitario(String titulo, String autor, int yearDePublicacion, boolean prestado, String carrera) {
        super(titulo, autor, yearDePublicacion, prestado);
        this.carrera = carrera;
    }

}
