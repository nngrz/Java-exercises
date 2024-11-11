public class LeapYear {

    static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 100 == 0 && year % 400 == 0;
    }

    public static void main(String[] args) {
        int yearToTest = 1997;
        System.out.println(isLeapYear(yearToTest));
    }
}