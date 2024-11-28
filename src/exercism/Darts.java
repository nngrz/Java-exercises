class Darts {
    static int score(double xOfDart, double yOfDart) {
        double userRadius = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        if (userRadius >= 0 && userRadius <= Math.pow(1.0, 2)) {
            return 10;
        } else if (userRadius > Math.pow(1.0, 2) && userRadius <= Math.pow(5.0, 2)) {
            return 5;
        } else if (userRadius > Math.pow(5.0, 2) && userRadius <= Math.pow(10.0, 2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(Darts.score(2.0, 3.0));
    }
}
