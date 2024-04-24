package TrabajoPractico3.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Profesor profe = new Profesor(44841460, "Paulo", "Lengua");
        Asignatura asignatura1 = new Asignatura(2, "14.30", "Lengua");
        Alumno alumno1 = new Alumno(44841460, "Pedro");
        Grupo grupo1 = new Grupo("Curso lab", 'a');

        profe.addAsignaturas(asignatura1);
        asignatura1.addGrupo(grupo1);
        alumno1.addGrupo(grupo1);
        grupo1.addAlumnos(alumno1);

        profe.mostrarAsignaturas();
        asignatura1.mostrarDatosGrupo(grupo1);

    }
}
