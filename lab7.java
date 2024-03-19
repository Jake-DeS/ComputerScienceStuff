import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            // Get two numbers from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Display menu
            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            // Get user's choice
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            // Perform the chosen operation
            double result = 0.0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    continue; // Skip the rest of the loop and start over
            }

            // Display the result
            System.out.println("Result: " + result);

            // Ask the user if they want to run the program again
            System.out.print("Do you want to run the program again? (yes/no): ");
            String runAgain = scanner.next().toLowerCase();

            if (!runAgain.equals("yes")) {
                break; // Exit the loop if the user doesn't want to run the program again
            }

        } while (true); // Infinite loop, will break if the user chooses not to run again

        System.out.println("Program terminated.");
    }

    // Functions for mathematical operations
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero. Returning 0.0");
            return 0.0;
        }
    }
}
