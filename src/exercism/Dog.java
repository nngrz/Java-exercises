class Dog {
    String name;
    String breed;

    // constructor for the Dog class that initializes the name and breed variables
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // method to retrieve the name of the dog
    public String getName() {
        return name;
    }

    // method to retrieve the breed of the dog
    public String getBreed() {
        return breed;
    }

    // method to set name and breed of the dog
    void setNameBreed(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Albert", "Golden Retriever");
        Dog dog2 = new Dog("Bun Bun", "German Shepherd");
        dog1.setNameBreed("Cindy", "Sausage Dog");
        System.out.println(dog1.getName() + " is a " + dog1.getBreed());
        dog2.setNameBreed("Yudian", "border Collie");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed());
    }
}
