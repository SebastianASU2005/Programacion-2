package TrabajoPractico3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {
private List<Grupo> grupos;

    public Alumno() {
    }

    public Alumno(int id, String name) {
        super(id, name);
        this.grupos = new ArrayList<>();
    }

    public void addGrupo(Grupo grupo){
        grupos.add(grupo);
    }

    public void mostrarLetra(){
        for(Grupo grup:grupos){
            System.out.println("letra: "+grup.getLetra());
        }
    }
    public void mostrarAsignaturas(Grupo grupi){
        grupi.mostrarAsignaturas(grupi);
    }
}
