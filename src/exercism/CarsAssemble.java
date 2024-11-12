public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double productionRate = 221.0;
        if (speed >= 1 && speed <= 4) {
            productionRate = 221.0 * speed;
        } else if (speed >= 5 && speed <= 8) {
            productionRate = 221.0 * speed * 0.9;
        } else if (speed == 9) {
            productionRate = 221.0 * speed * 0.8;
        } else if (speed == 10) {
            productionRate = 221.0 * speed * 0.77;
        } else {
            productionRate = 0;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();
        System.out.println(carsAssemble.productionRatePerHour(6));
        System.out.println(carsAssemble.workingItemsPerMinute(6));
    }
}