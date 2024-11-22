class Dog {
    String name;
    String breed;

    // get the name and breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // reset the name and breed
    public void setNameBreed(String setName, String setBreed) {
        name = setName;
        breed = setBreed;
    }

    // print the name and breed
    void print() {
        System.out.println(name + " is a " + breed);
    }

    // print the resetted name and breed
    void setPrint() {
        System.out.println(name + " is a " + breed);
    }

    public static void main(String[] args) {
        // get the name and breed, and print
        Dog dog1 = new Dog("Albert", "Golden Retriever");
        dog1.print();
        Dog dog2 = new Dog("Bun Bun", "German Shepherd");
        dog2.print();
        // reset the name and breed, and print
        Dog dog1Set = new Dog ("Cindy", "Sausage Dog");
        dog1Set.setPrint();
        Dog dog2Set = new Dog ("Yudian", "border Collie");
        dog2Set.setPrint();
    }
}
