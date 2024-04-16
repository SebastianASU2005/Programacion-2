package TrabajoPractico2.TrabajoPractico_2_ej2;

public class Libro implements Prestable{
   private String titulo;
   private String autor;
   private int yearDePublicacion;
   private boolean prestado;

    public Libro() {
    }

    public Libro(String titulo, String autor, int yearDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearDePublicacion = yearDePublicacion;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYearDePublicacion() {
        return yearDePublicacion;
    }

    public void setYearDePublicacion(int yearDePublicacion) {
        this.yearDePublicacion = yearDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar(){
        prestado=true;
    }
    public void devolver(){
        prestado=false;
    }
}
