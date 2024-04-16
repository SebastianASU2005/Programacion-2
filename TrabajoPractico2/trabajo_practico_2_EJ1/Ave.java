package TrabajoPractico2.trabajo_practico_2_EJ1;

public class Ave extends Animal{
    private String especie;
    private boolean habla;

    public Ave(String nombre, int edad, double precio, String especie, boolean habla) {
        super(nombre, edad,"Ave", precio);
        this.especie = especie;
        this.habla = habla;
    }
}
