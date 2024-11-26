import java.util.Scanner;

class ReverseString {

    String reverse(String inputString) {
        char[] chars = inputString.toCharArray();
        String reversedString = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedString += chars[i];
        }
        return reversedString;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = s.next();
        s.close();
        System.out.println(reverseString.reverse(userInput));
    }
}
