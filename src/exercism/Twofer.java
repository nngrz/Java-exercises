import java.util.Scanner;

public class Twofer {
    public String twofer(String name) {
        // if you don't know the name, print "you", otherwise print the name
        if (name == null || name.isEmpty()) {
           name = "you";
       }
       return "One for " + name + ", one for me.";
    }
    
    public static void main(String[] args) {
        Twofer twofer = new Twofer();
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = s.nextLine();
        s.close();
        System.out.println(twofer.twofer(name));
    }
}
