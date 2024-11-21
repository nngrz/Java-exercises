class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p = new Person("Albert", 32);
        System.out.println(p.print());
    }
}
