public class Guest {
    private String nr;
    public static int counter;
    public int positionOfGuest;

    public Guest(String name) {
        nr = name;
        counter++;
        positionOfGuest = counter;
    }

    public static void printTotal() {
        System.out.println("Total guests: " + counter);
    }

    public void printInfo() {
        System.out.println(nr + " is the " + positionOfGuest + " invite");
    }

    public static void main (String[] args) {
        Guest guest1 = new Guest("Haohao");
        Guest guest2 = new Guest("Albert");
        Guest.printTotal(); // should print: `Total guests: 2`
        Guest guest3 = new Guest("Tomek");
        guest2.printInfo(); // should print: ‘Albert is the 2 invite`
        guest3.printInfo(); // should print: `Tomek is the 3 invite`
        guest1.printInfo(); // should print: `Haohao is the 1 invite`
        Guest.printTotal(); // should print: `Total guests: 3`
    }
}
