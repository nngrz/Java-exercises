import java.util.Scanner;

public class SimpleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an initial: ");
        char innitial = scanner.next().charAt(0);
        scanner.close();

        switch (innitial) {
            case 'A':
            case 'a':
                System.out.println("Amelia");
                break;
            case 'B':
            case 'b':
                System.out.println("Barbra");
                break;
            case 'C':
            case 'c':
                System.out.println("Cindy");
                break;
            case 'D':
            case 'd':
                System.out.println("Doris");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}