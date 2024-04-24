package TrabajoPractico3.ejercicio2;

public class Empleado {
    private String name;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String name) {
        this.name = name;

    }

    public void asignarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public String obtenerNameSupervisor() {
        if (supervisor != null) {
            return supervisor.getName();
        } else {
            return "sin supervisor";
        }
    }

    public String obtenerName() {
        return name;
    }


}
