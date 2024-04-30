package Classes;

public class Athlete extends Person implements Contract{
    private double height;
    private int age;
    private double weight;

    public Athlete() {
    }

    public Athlete(int dni, String nombre, double height, int age, double weight) {
        super(dni, nombre);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calcularIMC() {
        return weight / (height * height);
    }

    @Override
    public boolean hayPesoExtra(double imc) {
        return imc > 25;
    }

    @Override
    public double tomarPulsasiones() {
        return 0;
    }

}
