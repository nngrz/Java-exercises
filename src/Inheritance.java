class Animal {
    String name;
    double weight;

    public Animal (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    public String toString() {
        return name + " weighs " + weight + " kg.";
    }
}

class Dog extends Animal {

    public Dog (String name, double weight) {
        super(name, weight);
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Albert", 100);
        Animal dog = new Dog("Albb", 95);

        animal.sound();
        System.out.println(animal.toString());
        dog.sound();
        System.out.println(dog.toString());
    }
}
