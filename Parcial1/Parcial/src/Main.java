import Classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creacion de una instalacion
        Facility instalacion = new Facility("Categoría 1", "Localización 1", "Nombre Instalación", "Tipo 1");

        //Creacion de los atletas
        Athlete atleta1 = new Athlete(12345678, "Juan", 1.75, 25, 70);
        Athlete atleta2 = new Athlete(87654321, "Ana", 1.65, 30, 65);
        Athlete atleta3 = new Athlete(11223344, "Luis", 1.80, 28, 80);

        //Creacion de lista de atletas
        List<Athlete> atletas=new ArrayList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);

        //Creacion de las pruebas
        Test test1 = new Test(1, "Prueba 1", instalacion,atletas);
        Test test2 = new Test(2, "Prueba 2", instalacion,atletas);
        instalacion.agregarPrueba(test1);
        instalacion.agregarPrueba(test2);
        //Creacion de la sede
        Campus campus = new Campus(1, "2024-04-30", "10:00");

        // Más atletas...
        //Creacion del equipo nacional
        NationalTeam equipoNacional = new NationalTeam("Rojo", "España");
        equipoNacional.agregarAtleta(atleta1);
        equipoNacional.agregarAtleta(atleta2);
        equipoNacional.agregarAtleta(atleta3);
        //Clases instanciadas


        // Mostrar desde un objeto Instalacion
        System.out.println("Nombre del 3er atleta de la 2da prueba: " + instalacion.getTests().get(1).getParticipates().get(2).getNombre());
        System.out.println("Código de la 2da prueba: " + instalacion.getTests().get(1).getCode());



        // Mostrar desde un objeto EquipoNacional
        for (Athlete atleta : equipoNacional.getAthletes()) {
            System.out.println("Altura de " + atleta.getNombre() + ": " + atleta.getHeight());
            System.out.println("Peso extra de " + atleta.getNombre() + ": " + (atleta.hayPesoExtra(atleta.calcularIMC()) ? "Sí" : "No"));
        }
    }
}