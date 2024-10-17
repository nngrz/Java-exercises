import java.util.Scanner;

public class SquareRoots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n;
        while ((n = scan.nextInt()) != 0) {
            System.out.println("Enter a number: ");
            if ( n < 0) {
                System.out.println("Try again");
                continue;
            }
            System.out.println("square root of " + n + " is " + Math.sqrt((double)(n)));
        }
        scan.close();
    }
}

// The above loop will print square roots of integers read from the keyboard,
// but only of positive ones; the loop ends when the user enters 0.