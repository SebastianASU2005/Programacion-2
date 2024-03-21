package Clases;

public class Perro extends Animal{
    private String raza;
    private String estado;

    public Perro() {
    }

    public Perro(String nombre, String genero, int edad, String raza, String estado) {
        super(nombre, genero, edad);
        this.raza = raza;
        this.estado = estado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    @Override
    public void Make_Sound() {
        System.out.println("Gua,Gua");
    }
    @Override
    public void Informacion(){
        System.out.println("Informacion");
        System.out.println(getClass().getSimpleName());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
        System.out.println("Genero: "+getGenero());
        System.out.println("Raza: "+getRaza());
        System.out.println("Estado: "+getEstado());
    }
}
