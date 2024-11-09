public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int x) {
        return expectedMinutesInOven() - x;
    }
    public int preparationTimeInMinutes(int x) {
        return 2 * x;
    }
    public int totalTimeInMinutes(int x, int y) {
        return preparationTimeInMinutes(x) + y;
    }
    
    public static void main(String[] args) {
        Lasagna la = new Lasagna();
        System.out.println("Expected: " + la.expectedMinutesInOven());
        System.out.println("Remaining: " + la.remainingMinutesInOven(2));
        System.out.println("Preparation time: " + la.preparationTimeInMinutes(2));
        System.out.println("Total Time: " + la.totalTimeInMinutes(3,20));
    }
}
