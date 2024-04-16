import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Leer 10 enteros del usuario y almacenarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Encontrar el mayor número primo y su posición en el arreglo
        int biggerPrimo = Integer.MIN_VALUE;
        int biggerPrimoPosition=1;


        for (int i = 0; i < 10; i++) {
            int numeroActual = numbers[i];
            if (esPrimo(numeroActual) && numeroActual > biggerPrimo) {
                biggerPrimo = numeroActual;
                biggerPrimoPosition = i;
            }
        }

        // Mostrar el arreglo y la posición del mayor número primo
        System.out.println("Arreglo ingresado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Salto de línea

        if (biggerPrimoPosition != -1) {
            System.out.println("El mayor número primo es " + biggerPrimo + " y se encuentra en la posición " + biggerPrimoPosition);
        } else {
            System.out.println("No se encontró ningún número primo en el arreglo.");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}