package Classes;

public class Circulo implements Figura,Dibujable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        double area=(3.14*(radio*radio));
        return (float) area;
    }

    @Override
    public void dibujar() {
        System.out.println("Circulo dibujado");
    }
}
