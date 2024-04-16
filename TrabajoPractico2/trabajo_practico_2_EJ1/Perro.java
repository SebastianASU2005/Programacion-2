package TrabajoPractico2.trabajo_practico_2_EJ1;

public class Perro extends Animal{
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, double precio, String raza, boolean vacunado) {
        super(nombre, edad,"Perro", precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }
}
