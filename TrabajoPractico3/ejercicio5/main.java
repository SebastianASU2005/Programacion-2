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

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese la descripción de la tarea:");
                        String descripcion = scanner.nextLine();
                        int prioridad;
                        while (true) {
                            try {
                                System.out.println("Ingrese la prioridad de la tarea (un número entero):");
                                prioridad = scanner.nextInt();
                                scanner.nextLine(); // Consumir el salto de línea
                                break;
                            } catch (Exception e) {
                                System.out.println("Error: Por favor, ingrese un valor numérico para la prioridad.");
                                scanner.nextLine(); // Limpiar el buffer del scanner
                            }
                        }
                        Tarea nuevaTarea = new Tarea(descripcion, prioridad);
                        listaDeTareas.addTarea(nuevaTarea);
                        break;
                    // Resto de los casos...
                }
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingrese un valor numérico para la opción.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }
}