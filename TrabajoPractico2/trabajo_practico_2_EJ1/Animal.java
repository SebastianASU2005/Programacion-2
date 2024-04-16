package TrabajoPractico2.trabajo_practico_2_EJ1;

public class Animal {
    private String nombre;
    private int edad;
    private String tipoAnimal;
    private double precio;

    public Animal() {
    }

    public Animal(String nombre, int edad, String tipoAnimal, double precio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void alimentar(String nombre){
        System.out.println(nombre+ " ha sido alimentado");
    }


}
