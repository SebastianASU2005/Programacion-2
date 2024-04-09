package Classes;

public class Employe {
    private String name;
    private String Charge;

    public Employe() {
    }

    public Employe(String name, String charge) {
        this.name = name;
        Charge = charge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharge() {
        return Charge;
    }

    public void setCharge(String charge) {
        Charge = charge;
    }
}
