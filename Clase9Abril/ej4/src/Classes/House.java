package Classes;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Door> doors;

    public House() {
        this.doors=new ArrayList<>();
    }

    public List<Door> getDoors() {
        return doors;
    }
    public void construirCasa() {
        // Crear algunas puertas y agregarlas a la lista de puertas de la casa
        doors.add(new Door("Madera"));
        doors.add(new Door("Metal"));
        doors.add(new Door("Vidrio"));
    }
}
