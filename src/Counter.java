public class Counter {
    static int count;

    static int increment(){
        return ++count;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            System.out.println("Count: " + increment());
        }
    }
}
