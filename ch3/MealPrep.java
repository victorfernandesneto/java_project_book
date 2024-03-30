public class MealPrep {
    public static void main(String[] args) {
        double weight = 8_000.0;
        double foodPerDay = weight * 0.03;
        int timesFed = 3;
        double foodPerMeal = foodPerDay / timesFed;
        String out = "Our " + (int)weight + " kg T-Rex needs to eat " + foodPerDay + " kg daily, which means we need to serve " + foodPerMeal + " kg per feeding.";
        System.out.println(out);
    }
}
