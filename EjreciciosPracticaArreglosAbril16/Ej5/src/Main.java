import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = new int[10];


        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        int maxNumber = findMax(numbers);


        int occurrences = countOccurrences(numbers, maxNumber);


        System.out.println("El número máximo es: " + maxNumber);
        System.out.println("Se repite " + occurrences + " veces en el arreglo.");
    }
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int countOccurrences(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }
}