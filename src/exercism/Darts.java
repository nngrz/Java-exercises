class Darts {
    static int score(double xOfDart, double yOfDart) {
        double userRadius = xOfDart * xOfDart + yOfDart * yOfDart;
        if (userRadius <= 1.0 * 1.0) {
            return 10;
        } else if (userRadius <= 5.0 * 5.0) {
            return 5;
        } else if (userRadius <= 10.0 * 10.0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Darts.score(2.0, 3.0));
    }
}
