import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;
        if (numberOfDays > birdsPerDay.length) {
            System.out.print("Index 7 out of bounds for length 7, the first 7 days counts are ");
        }
        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            total += birdsPerDay[i];
        }

        return total;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    public static void main(String[] args) {
        // Task 1: Check what the counts were last week
        int[] birdsLastWeek = {0, 2, 5, 3, 7, 8, 4};
        BirdWatcher birdLastWeek = new BirdWatcher(birdsLastWeek);
        System.out.println(Arrays.toString(birdLastWeek.getLastWeek()));


        // Task 2: Check how many birds visited today
//        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println(birdCount.getToday());

        // Task 3: Increment today's count
//        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        birdCount.incrementTodaysCount();
//        System.out.println(birdCount.getToday());

        // Task 4: Check if there was a day with no visiting birds
//        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println(birdCount.hasDayWithoutBirds());

//        // Task 5: Calculate the number of visiting birds for the first number of days
//        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println(birdCount.getCountForFirstDays(10));

        // Task 6: Calculate the number of busy days
//        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
//        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
//        System.out.println(birdCount.getBusyDays());
    }
}
