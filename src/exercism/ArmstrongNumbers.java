import java.util.Scanner;

class ArmstrongNumbers {
    
    int getNumberOfDigits(int numberToCheck) {
        int count = 0;
        do {
            numberToCheck = numberToCheck / 10;
            count++;
        } while (numberToCheck != 0);
        return count;
    }
    
    boolean isArmstrongNumber(int numberToCheck) {
        int originalNumber = numberToCheck;
        int numberOfDigits = getNumberOfDigits(numberToCheck);
        int result = 0;

        do {
            int digit = numberToCheck % 10;
            result += Math.pow(digit, numberOfDigits);
            numberToCheck = numberToCheck / 10;
        } while (numberToCheck != 0);
        
        return originalNumber == result;
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
