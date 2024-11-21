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
        Person pAlbert = new Person("Albert", 32);
        System.out.println(pAlbert.print());
        Person pHaohao = new Person("Haohao", 27);
        System.out.println(pHaohao.print());
    }
}
