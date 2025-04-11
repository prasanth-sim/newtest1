import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform multiplication
        int product = num1 * num2;

        // Display the result
        System.out.println("The product is: " + product);

        scanner.close();
    }
}
