package TrabajoPractico3.ejercicio5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaTareas listaDeTareas = new ListaTareas();

        while (true) {
            System.out.println("1. Agregar nueva tarea");
            System.out.println("2. Mostrar todas las tareas");
            System.out.println("3. Eliminar una tarea");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea:");
                    String descripcion = scanner.nextLine();
                    System.out.println("Ingrese la prioridad de la tarea (un número entero):");
                    int prioridad = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    Tarea nuevaTarea = new Tarea(descripcion, prioridad);
                    listaDeTareas.addTarea(nuevaTarea);
                    break;
                case 2:
                    System.out.println("Todas las tareas:");
                    for (Tarea tarea : listaDeTareas) {
                        System.out.println(tarea);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la descripción de la tarea que desea eliminar:");
                    String tareaAEliminar = scanner.nextLine();
                    listaDeTareas.eliminarTarea(tareaAEliminar);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
    }
}
