class Leap {
    boolean isLeapYear(int year) {
       return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        Leap leapYear = new Leap();
        System.out.println(leapYear.isLeapYear(1900));
    }
}