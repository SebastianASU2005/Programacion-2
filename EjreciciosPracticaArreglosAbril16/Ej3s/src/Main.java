public class Main {
    public static void main(String[] args) {
        int[] primes = new int[10];
        int primeCount = 0;


        for (int num = 100; num <= 300; num++) {
            if (isPrime(num)) {
                primes[primeCount++] = num;
                if (primeCount == 10) {
                    break;
                }
            }
        }


        System.out.println("Los 10 numero primo entre 100 y 300 son ");
        for (int i = 0; i < 10; i++) {
            System.out.println(primes[i]);
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}