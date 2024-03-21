package Class;

public class Motocicleta extends Bicicleta {
    private int velocity;
    private int cilindrada;

    public Motocicleta(String color, int ruedas, String tipo, int velocity, int cilindrada) {
        super(color, ruedas, tipo);
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
        return super.toString()+
                " velocity=" + velocity +
                ", cilindrada=" + cilindrada ;
    }
}
