import com.mathlibrary.MathOperations;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("\nSelect operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.print("What is you option?(1,2,3,4 or 5): ");
        int choice = scanner.nextInt();

        if (choice == 5) {
            System.out.println("Goodbye!");
            running = false;
        }
        else {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch(choice) {
                case 1:
                    result = math.add(num1, num2);
                    System.out.println("Result for addition : " + result);
                    break;
                case 2:
                    result = math.subtract(num1, num2);
                    System.out.println("Result for subtraction : " + result);
                    break;
                case 3:
                    result = math.divide(num1, num2);
                    System.out.println("Result for division : " + result);
                    break;
                case 4:
                    result = math.multiply(num1, num2);
                    System.out.println("Result for multiplication : " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}