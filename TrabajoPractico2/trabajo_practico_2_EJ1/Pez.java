package TrabajoPractico2.trabajo_practico_2_EJ1;

public class Pez extends Animal{
    private String tipoPez;
    private boolean nada;

    public Pez(String nombre, int edad,  double precio, String tipoPez, boolean nada) {
        super(nombre, edad,"Pez", precio);
        this.tipoPez = tipoPez;
        this.nada = nada;
    }
}
