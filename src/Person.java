public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public static String species() {
        return "Human";
    }

    public String greet(){
        return "Hello, my name is " + name + ".";
    }

    public static void main(String[] args){
        System.out.println(species());
        Person person = new Person("Albert");
        System.out.println(person.greet());
    }
}
