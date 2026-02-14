import java.util.Scanner;

class ModularCalculator {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    static void changeValue(int x) {
        x = x + 10;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Addition (int): " + add(a, b));
            System.out.println("Addition (double): " + add(5.5, 2.5));
            System.out.println("Subtraction: " + subtract(a, b));
            System.out.println("Multiplication: " + multiply(a, b));

            try {
                System.out.println("Division: " + divide(a, b));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        int x = 10;
        changeValue(x);
        System.out.println("Value after method call (pass by value): " + x);
    }
}
