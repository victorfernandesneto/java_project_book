package ch6;

public class DinoTracker {
    public static void main(String[] args) {
        String [] dinoNames = {"Dino1", "Dino2", "Dino3", "Dino4", "Dino5", "Dino6", "Dino7", "Dino8", "Dino9", "Dino10"};
        int [] dinoAges = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String [] dinoSpecies = {"T-Rex", "Velociraptor", "Triceratops", "T-Rex", "Velociraptor", "Triceratops", "T-Rex", "Velociraptor", "Triceratops", "Eae"};
        double [] dinoEnclosures = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i=0; i<10; i++){
            System.out.println("Name: " + dinoNames[i]);
            System.out.println("Age: " + dinoAges[i]);
            System.out.println("Species: " + dinoSpecies[i]);
            System.out.println("Enclosure: " + dinoEnclosures[i]);
            System.out.println();
        }
int sum = 0;
        for (int age: dinoAges){
            sum += age;
        }
        double averageAge = Math.round((sum / dinoAges.length)*100);
        System.out.println("Average age: " + averageAge/100);

    }
}
