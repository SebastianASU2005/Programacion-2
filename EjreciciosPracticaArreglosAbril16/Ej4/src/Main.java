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


            System.out.println("Posiciones de los números que terminan en 4:");
            for (int i = 0; i < 10; i++) {
                if (endsWithFour(numbers[i])) {
                    System.out.println("El número " + numbers[i] + " está en la posición " + i);
                }
            }
    }
    public static boolean endsWithFour(int number) {
        return number % 10 == 4;
    }
}