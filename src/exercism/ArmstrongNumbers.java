import java.util.Scanner;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int numberOfDigits = 0;
        int result = 0;

        // Get number of digits
        int temp = numberToCheck;
        do {
            temp = temp / 10;
            numberOfDigits++;
        } while (temp != 0);

        // Reset the temp to the original user input
        temp = numberToCheck;
        // Calculate the sum of digits each raised to the power of the number of digits
        do {
            int digit = temp % 10;
            result += Math.pow(digit, numberOfDigits);
            temp = temp / 10;
        } while (temp != 0);
        
        return numberToCheck == result;
    }

    public static void main(String[] args) {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s.nextInt();
        s.close();
        System.out.println(armstrongNumbers.isArmstrongNumber(number));
    }
}
