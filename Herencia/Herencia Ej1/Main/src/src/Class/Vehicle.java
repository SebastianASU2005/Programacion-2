package Class;

public class Vehicle {
    private String color;
    private int ruedas;

    public Vehicle() {
    }

    public Vehicle(String color, int ruedas) {
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return
                "color='" + color + '\'' +
                ", ruedas=" + ruedas;
    }
}
