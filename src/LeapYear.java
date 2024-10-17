public class LeapYear {
    public static void main(String[] args) {
        int year = 1901;
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        System.out.println(isLeap);
    }
}

// Conditional statements