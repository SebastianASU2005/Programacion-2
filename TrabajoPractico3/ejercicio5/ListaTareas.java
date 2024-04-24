package TrabajoPractico3.ejercicio5;

import java.util.*;

public class ListaTareas implements Iterable<Tarea> {

    private List<Tarea> tareas;

    public ListaTareas() {
        tareas = new ArrayList<>();
    }
    public void addTarea(Tarea tarea){
        tareas.add(tarea);
    }

    public void eliminarTarea(String descripcion) {
        Iterator<Tarea> iter = tareas.iterator();
        while (iter.hasNext()) {
            Tarea tarea = iter.next();
            if (tarea.getDescripcion().equals(descripcion)) {
                iter.remove();
                break;
            }
        }
    }

    public int obtenerNumeroDeTareas() {
        return tareas.size();
    }

    @Override
    public Iterator<Tarea> iterator() {
        // Ordenar las tareas por prioridad descendente
        Collections.sort(tareas, Comparator.comparingInt(Tarea::getPrioridad).reversed());
        return tareas.iterator();
    }
}
