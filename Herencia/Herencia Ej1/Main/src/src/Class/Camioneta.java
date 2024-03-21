package Class;

public class Camioneta extends Auto {
    private int carga;

    public Camioneta(String color, int ruedas, int velocity, int cilindrada) {
        super(color, ruedas, velocity, cilindrada);
    }

    public Camioneta(String color, int ruedas, int velocity, int cilindrada, int carga) {
        super(color, ruedas, velocity, cilindrada);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString()+
                " carga=" + carga;
    }
}
