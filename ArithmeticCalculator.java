import java.lang.Math;
import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Using java.lang.Math package for basic arithmetic calculations
        System.out.println("Using java.lang.Math package:");
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));
        System.out.println("Square root of num1: " + Math.sqrt(num1));
        System.out.println("Absolute value of num2: " + Math.abs(num2));

        // Using java.util.Math package for advanced arithmetic calculations
        System.out.println("Using java.util.Math package:");
        System.out.println("Power of num1 to num2: " + Math.pow(num1, num2));
        System.out.println("Logarithm of num1 base 10: " + Math.log10(num1));
        System.out.println("Logarithm of num2 base e: " + Math.log(num2));
        System.out.println("Sine of num1: " + Math.sin(num1));
        System.out.println("Cosine of num2: " + Math.cos(num2));
    }
}
