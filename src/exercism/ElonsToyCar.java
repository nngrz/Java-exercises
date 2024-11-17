public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distance + " meters";
    }

    public String batteryDisplay() {
        return battery == 0 ? "Battery empty" : "Battery at " + battery + "%";
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
