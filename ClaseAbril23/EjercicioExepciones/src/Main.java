import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Introduce el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Introduce el segundo número: ");
                double num2 = scanner.nextDouble();

                System.out.print("Elige la operación (suma, resta, multiplicación, división): ");
                String operacion = scanner.next();

                switch (operacion.toLowerCase()) {
                    case "suma":
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case "resta":
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case "multiplicacion":
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case "division":
                        if (num2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                        } else {
                            System.out.println("Resultado: " + (num1 / num2));
                        }
                        break;
                    default:
                        System.out.println("Operación no reconocida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un número válido.");
                scanner.next(); // Esto es necesario para evitar un bucle infinito.
            }

            System.out.print("¿Deseas realizar otra operación? (si/no): ");
            if (scanner.next().equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
    }
}