// File: Calculator.java

public class Calculator {
    private double result;

    public Calculator() {
        result = 0;
    }

    public double getResult() {
        return result;
    }

    public void add(double number) {
        result += number;
    }

    public void subtract(double number) {
        result -= number;
    }

    public void multiply(double number) {
        result *= number;
    }

    public void divide(double number) {
        if (number != 0) {
            result /= number;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public void clear() {
        result = 0;
    }
}
