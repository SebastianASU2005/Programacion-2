package Clases;

public class Pajaro extends Animal{
    private String especie;
    private String plumaje;

    public Pajaro() {
    }

    public Pajaro(String nombre, String genero, int edad, String especie, String plumaje) {
        super(nombre, genero, edad);
        this.especie = especie;
        this.plumaje = plumaje;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    public void Make_Sound() {
        System.out.println("Pio,pio");
    }
    @Override
    public void Informacion(){
        System.out.println("Informacion");
        System.out.println(getClass().getSimpleName());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Genero: "+getGenero());
        System.out.println("Especie: "+getEspecie());
        System.out.println("Plumaje: "+getPlumaje());
    }
}
