import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class AdvanceCalculator {

    // List to store calculation history
    private static ArrayList<String> history = new ArrayList<>();

    // Display the main menu
    public static void displayMenu() {
        System.out.println("\n=== Smart Calculator ===");
        System.out.println("1. Basic Operations (+, -, *, /)");
        System.out.println("2. Power (x^y)");
        System.out.println("3. Square Root (√x)");
        System.out.println("4. Trigonometric Functions (sin, cos, tan)");
        System.out.println("5. Logarithm (log base 10)");
        System.out.println("6. View History");
        System.out.println("7. Clear History");
        System.out.println("8. Exit");
    }

    // Perform basic operations
    public static void basicOperations(Scanner scanner) {
        System.out.println("\nEnter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + result);
            history.add(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }

    // Calculate power
    public static void powerFunction(Scanner scanner) {
        System.out.println("\nEnter the base (x): ");
        double base = scanner.nextDouble();
        System.out.println("Enter the exponent (y): ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        history.add(base + "^" + exponent + " = " + result);
    }

    // Calculate square root
    public static void squareRootFunction(Scanner scanner) {
        System.out.println("\nEnter the number: ");
        double num = scanner.nextDouble();

        if (num >= 0) {
            double result = Math.sqrt(num);
            System.out.println("Result: " + result);
            history.add("√" + num + " = " + result);
        } else {
            System.out.println("Error: Cannot calculate square root of a negative number!");
        }
    }

    // Trigonometric functions
    public static void trigonometricFunctions(Scanner scanner) {
        System.out.println("\nChoose a function: sin, cos, tan");
        String function = scanner.next().toLowerCase();
        System.out.println("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        double radians = Math.toRadians(angle);
        double result = 0;
        boolean validFunction = true;

        switch (function) {
            case "sin":
                result = Math.sin(radians);
                break;
            case "cos":
                result = Math.cos(radians);
                break;
            case "tan":
                result = Math.tan(radians);
                break;
            default:
                System.out.println("Invalid function!");
                validFunction = false;
        }

        if (validFunction) {
            System.out.println("Result: " + result);
            history.add(function + "(" + angle + ") = " + result);
        }
    }

    // Logarithm
    public static void logarithmFunction(Scanner scanner) {
        System.out.println("\nEnter the number: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            double result = Math.log10(num);
            System.out.println("Result: " + result);
            history.add("log(" + num + ") = " + result);
        } else {
            System.out.println("Error: Logarithm is undefined for non-positive numbers!");
        }
    }

    // Display calculation history
    public static void viewHistory() {
        if (history.isEmpty()) {
            System.out.println("\nNo history available!");
        } else {
            System.out.println("\nCalculation History:");
            for (String record : history) {
                System.out.println(record);
            }
        }
    }

    // Clear calculation history
    public static void clearHistory() {
        history.clear();
        System.out.println("\nHistory cleared!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.println("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicOperations(scanner);
                    break;
                case 2:
                    powerFunction(scanner);
                    break;
                case 3:
                    squareRootFunction(scanner);
                    break;
                case 4:
                    trigonometricFunctions(scanner);
                    break;
                case 5:
                    logarithmFunction(scanner);
                    break;
                case 6:
                    viewHistory();
                    break;
                case 7:
                    clearHistory();
                    break;
                case 8:
                    System.out.println("\nExiting Smart Calculator. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
