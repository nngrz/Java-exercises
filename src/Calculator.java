import java.util.Scanner;

public class Calculator {
    int sum;

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = s.nextInt();
        System.out.println("Enter b: ");
        int b = s.nextInt();
        System.out.println("Enter c: ");
        int c = s.nextInt();

        System.out.println("Sum of a and b is: " + add(a, b));
        System.out.println("Sum of a, b and c is: " + add(a, b, c));
    }
}
