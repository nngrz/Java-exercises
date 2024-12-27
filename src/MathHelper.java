import java.util.Scanner;

public class MathHelper {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        scanner.close();

        System.out.println("Result of add method: " + add(firstNumber, secondNumber));
        System.out.println("Result of subtract method: " + subtract(firstNumber, secondNumber));
        System.out.println("Result of multiply method: " + multiply(firstNumber, secondNumber));
    } 
}
