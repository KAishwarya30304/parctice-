import java.util.Scanner;

public class strong_num {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int product = 1;


            for (int i = 1; i <= digit; i++) {
                product *= i;
            }

            // Add the factorial to the sum
            sum += product;

            // Remove the last digit
            temp /= 10;
        }

        // Check if the sum of the factorials is equal to the number
        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }
    }
}
