import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get user name
        System.out.println("Enter your name: ");       
        String name = s.nextLine();

        // Get user age
        System.out.println("Enter your age: ");
        int age = s.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old");
    }
}
