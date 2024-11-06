public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return 40 - x;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x){
        return 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
        return 2 * x + y;
    }
    
    public static void main(String[] args) {
        Lasagna la = new Lasagna();
        System.out.println("Expected: " + la.expectedMinutesInOven());
        System.out.println("Remaining: " + la.remainingMinutesInOven(2));
        System.out.println("Preparation time: " + la.preparationTimeInMinutes(2));
        System.out.println("Total Time: " + la.totalTimeInMinutes(3,20));
    }
}