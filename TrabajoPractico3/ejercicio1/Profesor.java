package TrabajoPractico3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private String departamento;
    private List<Asignatura> asignaturas;

    public Profesor() {
    }

    public Profesor(int id, String name, String departamento) {
        super(id, name);
        this.departamento = departamento;
        this.asignaturas = new ArrayList<>();
    }

    public void addAsignaturas(Asignatura asi){
        asignaturas.add(asi);
    }

    public void mostrarAula(Asignatura asignatura){
        for(Asignatura asi:asignaturas){
            System.out.println(asi.getAula());
            System.out.println(asi.getHora());
            System.out.println(asi.getNombre());
        }
    }

    public void mostrarAsignaturas(){
        System.out.println("Asignaturas del profe : "+ name);
        for(Asignatura asi: asignaturas){
            System.out.println(asi.getNombre());
        }
    }
}
