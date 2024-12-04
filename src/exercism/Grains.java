import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger base = new BigInteger("2");
        BigInteger exponent = new BigInteger(String.valueOf(square - 1));
        return base.pow(exponent.intValue());
    }

    BigInteger grainsOnBoard() {
        BigInteger totalGrains = new BigInteger("0");
        for (int i = 1; i <= 64; i++) {
            totalGrains = totalGrains.add(grainsOnSquare(i));
        }
        return totalGrains;
    }

    public static void main(String[] args) {
        Grains grains = new Grains();
        System.out.println(grains.grainsOnSquare(5));
        System.out.println(grains.grainsOnBoard());
    }
}
