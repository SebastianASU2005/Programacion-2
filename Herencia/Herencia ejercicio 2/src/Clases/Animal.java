package Clases;

public abstract class Animal {
    private String nombre;
    private String genero;
    private int edad;

    public Animal() {
    }

    public Animal(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Make_Sound() {
        System.out.println("generic sound");
    }
    public void Informacion(){

    }
}


