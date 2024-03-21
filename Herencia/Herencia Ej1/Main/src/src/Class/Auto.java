package Class;

public class Auto extends Vehicle {
    private int velocity;
    private int cilindrada;

    public Auto(String color, int ruedas) {
        super(color, ruedas);
    }

    public Auto(String color, int ruedas, int velocity, int cilindrada) {
        super(color, ruedas);
        this.velocity = velocity;
        this.cilindrada = cilindrada;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString()+" velocity=" + velocity + ",cilindrada=" + cilindrada;
    }
}
