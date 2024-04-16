package TrabajoPractico2.TrabajoPractico_2_ej2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void addLibros(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println("nombre: " + libro.getTitulo());
            }
        }
    }

    public void prestarLibro(String titulo) {
        Libro librito = buscarLibro(titulo);
        if (librito != null) {
            librito.prestar();
            System.out.println("se presto el libro: " + titulo);
        } else {
            System.out.println(" no se encontro el libro");
        }

    }

    public void devolverLibro(String titulo) {
        Libro librito = buscarLibro(titulo);
        if(librito!=null){
            librito.devolver();
            System.out.println(" se devolvio el libro: "+titulo);
        }else{
            System.out.println(" no se encontro el libro");
        }
    }

    public Libro buscarLibro(String nombre) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }
}
