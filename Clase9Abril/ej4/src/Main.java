import Classes.Door;
import Classes.House;

import javax.net.ssl.HostnameVerifier;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        House miCasa = new House();

        // Mostrar los materiales de las puertas de la casa
        List<Door> puertas = miCasa.getDoors();
        System.out.println("Materiales de las puertas de la casa:");
        for (Door puerta : puertas) {
            System.out.println("- " + puerta.getMaterial());
        }
    }
}