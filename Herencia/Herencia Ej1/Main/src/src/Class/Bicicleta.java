package Class;

public class Bicicleta extends Vehicle {
    private String tipo;

    public Bicicleta(String color, int ruedas) {
        super(color, ruedas);
    }

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+
                " tipo='" + tipo + '\'';
    }

}
