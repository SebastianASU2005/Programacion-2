package Clases;

public class Pez extends Animal{
    private String especie;
    private String aleta;

    public Pez() {
    }

    public Pez(String nombre, String genero, int edad, String especie, String aleta) {
        super(nombre, genero, edad);
        this.especie = especie;
        this.aleta = aleta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAleta() {
        return aleta;
    }

    public void setAleta(String aleta) {
        this.aleta = aleta;
    }

    @Override
    public void Make_Sound() {
        System.out.println("Glu,glu");
    }
    @Override
    public void Informacion(){
        System.out.println("Informacion");
        System.out.println(getClass().getSimpleName());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Genero: "+getGenero());
        System.out.println("Especie: "+getEspecie());
        System.out.println("Aleta: "+getAleta());
    }
}
