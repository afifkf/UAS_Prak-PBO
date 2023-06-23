// File: Main.java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add: ");
                    double addNumber = scanner.nextDouble();
                    calculator.add(addNumber);
                    System.out.println("Result: " + calculator.getResult());
                    break;
                case 2:
                    System.out.print("Enter a number to subtract: ");
                    double subtractNumber = scanner.nextDouble();
                    calculator.subtract(subtractNumber);
                    System.out.println("Result: " + calculator.getResult());
                    break;
                case 3:
                    System.out.print("Enter a number to multiply: ");
                    double multiplyNumber = scanner.nextDouble();
                    calculator.multiply(multiplyNumber);
                    System.out.println("Result: " + calculator.getResult());
                    break;
                case 4:
                    System.out.print("Enter a number to divide: ");
                    double divideNumber = scanner.nextDouble();
                    calculator.divide(divideNumber);
                    System.out.println("Result: " + calculator.getResult());
                    break;
                case 5:
                    calculator.clear();
                    System.out.println("Result: " + calculator.getResult());
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
