package Classes;

public class Cuadrado implements Figura,Dibujable,Rotable{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Cuadrado dibujado");
    }

    @Override
    public float calcularArea() {
        double area=lado*lado;
        return (float) area;
    }

    @Override
    public void rotar() {
        System.out.println("El cuadrado se rotó");
    }
}
