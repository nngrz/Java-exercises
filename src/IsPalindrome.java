public class IsPalindrome {
    public static String isPalindrome(int x) {
        if (x >= 0 && x < 10) { // One Digit
            return "One DigitalPal True";
        } else if (x >= 10 && x < 100) { // Two digit
            if (x % 10 == x / 10) {
                return "Two DigitalPal True";
            }
            return "Two DigitalPal False";

        }
        // three digit and more

        return "Unknown";
    }
    public static void printDigits(int nr) {
        int pos = 0;
        do {
            int digit = nr % 10;
            nr = nr / 10;
            pos += 1;
            System.out.print(digit);
            System.out.println(pos);
        }
        while (nr != 0);
    }

//    public static void printLastDigits(int nr, int k) {
//        do {
//            int digit = nr % 10;
//            nr = nr / 10;
//            k = k - 1;
//            System.out.println(digit + "; k = " + k);
//        }
//        while (k > 0);
//    }
    public static int get(int nr, int pos) {
        while (pos > 0) {
            nr = nr / 10;
            pos -= 1;
            System.out.println("pos = " + pos);
        }
        return nr % 10;
    }
    public static void main(String[] args) {
        System.out.println(get(987, 0));
//        System.out.println(isPalindrome(325));
//        System.out.println(isPalindrome(5));
//        System.out.println(isPalindrome(25));
//        System.out.println(isPalindrome(99));

      //  System.out.println(get(210, 1));
        //System.out.println(get(210, 2));
        //printListDigits(987654，1); // 4
        //printListDigits(987654，2); // 4 \n 5
//        printLastDigits(987654, 3); // 4 \n 5 \n 6
    }
}
