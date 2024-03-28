public class Profile {
    public static void main(String[] args) {
        String name = "Komodore";
        int age = 28;
        String species = "Triceratops";
        String diet = "herbivore";
        double weight = 12_000;
        String out = "Meet " + name + ", a " + age + "-year-old " + species + ". As a " + diet
                + ", it has a robust weight of " + weight + " kilograms.";
        System.out.println(out);
    }
}
