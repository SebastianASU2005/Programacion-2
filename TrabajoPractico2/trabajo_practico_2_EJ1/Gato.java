package TrabajoPractico2.trabajo_practico_2_EJ1;

public class Gato extends Animal{
    private String raza;
    private boolean esterilizado;

    public Gato(String nombre, int edad, double precio, String raza, boolean esterilizado) {
        super(nombre, edad,"Gato", precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }
}
