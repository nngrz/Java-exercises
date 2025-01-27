import java.util.Scanner;

public class CountCharacters {
    static int count(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.next();
        System.out.println("Enter a character: ");
        char c = scan.next().charAt(0);
        scan.close();

        System.out.println("Character " + c + " showed " + count(s, c) + " in string " + s);
    }
}
