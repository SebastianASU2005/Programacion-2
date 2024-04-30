import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberRandom = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int trys = 0;

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Intenta adivinar el número secreto (entre 1 y 100).");

        while (true) {
            System.out.print("Introduce tu intento: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                trys++;

                if (number == numberRandom) {
                    System.out.println("¡Felicidades! Has adivinado el número secreto en " + trys + " intentos.");
                    break;
                } else if (number < numberRandom) {
                    System.out.println("El número secreto es mayor que " + number+ ".");
                } else {
                    System.out.println("El número secreto es menor que " + number + ".");
                }
            } else {
                System.out.println("Error: Por favor, introduce un número válido.");
                trys++;
                scanner.next();
            }
        }

        scanner.close();
    }
}
