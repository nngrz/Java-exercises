class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "name: " + firstName + ", surname: " + lastName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Albert", "Balinski");
        Person p2 = new Person("Ningrui", "Zhang");
        System.out.println("name: " + p1.firstName + ", surname: " + p1.lastName); // name: Albert, surname: Balinski
        System.out.println(p1.toString() + " "+ p2.toString()); // name: Albert, surname: Balinski name: Ningrui, surname: Zhang
    }
}
