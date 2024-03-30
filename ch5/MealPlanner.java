public class MealPlanner {
    public static void main(String[] args) {
        int[] tRexMeals = { 8, 14, 20 };
        int[] brachiosaurusMeals = { 7, 11, 15, 19 };
        int tRexPortion = 100;
        int brachiosaurusPortion = 250;
        OUTERLOOP: for (int hour = 0; hour < 24; hour++) {
            for (int h : tRexMeals) {
                if (hour == h) {
                    System.out.println("It's " + hour + ":00, time to feed the Rex " + tRexPortion + " kg of food!");
                    wait(1000);
                    continue OUTERLOOP;
                }
            }
            for (int h : brachiosaurusMeals) {
                if (hour == h) {
                    System.out.println(
                            "It's " + hour + ":00, time to feed the big guy " + brachiosaurusPortion + " kg of food!");
                    wait(1000);
                    continue OUTERLOOP;
                }
            }
            System.out.println("It's " + hour + ":00, no need to feed anyone.");
            wait(1000);
        }
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
