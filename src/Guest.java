public class Guest {
    private String name;
    private static int counter;
    private int nr;
    private Guest plusOne;

    public Guest(String name) {
        this.name = name;
        counter++;
        nr = counter;
    }

    public void printPlusOne() {
        if (this.plusOne != null) {
            System.out.println(this.name + "'s plus one is " + this.plusOne);
        } else {
            System.out.println(this.name + " does not have a plus one.");
        }
    }

    public static void printTotal() {
        System.out.println("Total guests: " + counter);
    }

    public void printInfo() {
        System.out.println(name + " is the " + nr + " invite");
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main (String[] args) {
        Guest guest1 = new Guest("Haohao");
        Guest guest2 = new Guest("Albert");
        guest1.plusOne = guest2;
        guest1.printPlusOne();
        guest2.printPlusOne();
        Guest.printTotal(); // should print: `Total guests: 2`
        Guest guest3 = new Guest("Tomek");
        guest2.printInfo(); // should print: ‘Albert is the 2 invite`
        guest3.printInfo(); // should print: `Tomek is the 3 invite`
        guest1.printInfo(); // should print: `Haohao is the 1 invite`
        Guest.printTotal(); // should print: `Total guests: 3`
    }
}
