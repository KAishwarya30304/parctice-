import java.util.Scanner;

public class h_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = scanner.nextInt();


        int highestPrime = -1;
        for (int i = num; i >= 2; i--) {
            if (isPrime(i)) {
                highestPrime = i;
                break;
            }
        }

        // Output the result
        if (highestPrime != -1) {
            System.out.println("The highest prime number less than or equal to " + num + " is: " + highestPrime);
        } else {
            System.out.println("There are no prime numbers less than or equal to " + num);
        }
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
