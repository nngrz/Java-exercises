import  java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter integer a: ");
        int a = s.nextInt();
        System.out.println("Enter integer b: ");
        int b = s.nextInt();

        s.close();

        try {
            int division = a / b;
            System.out.println("The division is: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
