import java.util.HashSet;

class Cat {
    private String color;
    private String name;

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', color ='" + color + "'}";
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Yellow", "Mimi"); // Create a cat
        System.out.println(cat); // Print the cat

        HashSet<Cat> cats = new HashSet<Cat>(); // Make cat Collection
        cats.add(cat); // Put in the cat you made
        System.out.println("Cat Collection: " + cats); // Print the entire collection
    }
}
