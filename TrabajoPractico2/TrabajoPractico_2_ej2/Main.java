package TrabajoPractico2.TrabajoPractico_2_ej2;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear libros de cada clase
        Libro novela = new Novela("ThePaulo", "Gabriel García Márquez", 1967,false,"Historia");
        Libro universitario = new Universitario("Cálculo", "James Stewart", 1995,false, "Matemáticas");
        Libro infantil = new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, false,10);

        // Agregar libros a la biblioteca
        biblioteca.addLibros(novela);
        biblioteca.addLibros(universitario);
        biblioteca.addLibros(infantil);

        // Listar libros disponibles
        biblioteca.listarLibros();

        // Prestar un libro
        biblioteca.prestarLibro("Cálculo");

        // Devolver un libro
        biblioteca.devolverLibro("El principito");
    }
}
