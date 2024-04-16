import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el tamaño del arreglo
        int[] numbers = new int[10];

        // Leer 10 enteros del usuario y almacenarlos en el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el entero #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int Bigger=numbers[0];
        int BiggerPosition=0;
        for (int i=0; i<10;i++){
            if (Bigger<numbers[i]){
                Bigger=numbers[i];
                BiggerPosition=i;
            }
        }
        System.out.println("El mayor numero ingresado fue "+Bigger+" en la posicion "+(BiggerPosition+1));
    }

}