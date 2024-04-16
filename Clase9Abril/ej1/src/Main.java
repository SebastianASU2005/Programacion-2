import Classes.Student;
import Classes.University;

public class Main {
    public static void main(String[] args) {
        University universidad1 = new University("Universidad Nacional de Córdoba");
        University universidad2 = new University("Universidad de Buenos Aires");

        // Crear estudiantes
        Student estudiante1 = new Student("Juan",universidad2);
        Student estudiante2 = new Student("María",universidad2);

        // Mostrar la universidad de cada estudiante
        System.out.println(estudiante1.getName() + " estudia en " + estudiante1.getUniversity().getName());
        System.out.println(estudiante2.getName() + " estudia en " + estudiante2.getUniversity().getName());

        // Cambiar la universidad de un estudiante
        estudiante2.setUniversity(universidad1);
        System.out.println(estudiante2.getName() + " ahora estudia en " + estudiante2.getUniversity().getName());
    }
}