import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lectura de la base
            System.out.print("Introduce la base del triángulo: ");
            double base = Double.parseDouble(scanner.nextLine());

            // Lectura de la altura
            System.out.print("Introduce la altura del triángulo: ");
            double altura = Double.parseDouble(scanner.nextLine());

            // Cálculo del área
            double area = (base * altura) / 2;

            // Imprimir el resultado
            System.out.println("El área del triángulo es: " + area);
        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada no es un número válido.");
        } finally {
            scanner.close();
        }

    }
}
