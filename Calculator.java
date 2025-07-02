public class Calculator {
     // method to multiple two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }
    // method to divide two numbers
    public static double divide(int a, int b) { 
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
    // method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    // method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    // main method to test the calculator
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }
}
