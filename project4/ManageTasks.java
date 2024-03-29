package project4;

import java.util.Scanner;
import java.time.LocalTime;

public class ManageTasks {
    public static void main(String[] args) {
        // Design role assignment for feeding, cleaning, security and tour guiding
        LocalTime openingHours = LocalTime.parse("10:00");
        LocalTime closingHours = LocalTime.parse("19:00");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter security rating --> ");
            double securityRating = sc.nextDouble();
            System.out.print("What time is it?");
            LocalTime time = LocalTime.parse(sc.next());
            int opened = time.compareTo(openingHours);
            int closed = time.compareTo(closingHours);
            boolean parkOpen = (opened > 0) && (closed == 0);
            if (securityRating >= 9 && parkOpen) { // All operations normal
                System.out.print("Enter job title --> ");
                String jobTitle = sc.next();
                switch (jobTitle) {
                    case "Assistant" -> System.out.println("Help anyone that needs it");
                    case "Feeder" -> System.out.println("Feed the dinosaurs");
                    case "Cleaner" -> System.out.println("Clean the facilities");
                    case "Security" -> System.out.println("Maintain security rating above 9 points");
                    case "Guide" -> System.out.println("Guide guests through the park");
                }
            } else { // Only security must be present
                System.out.println("Evacuate guests and staff. Only security must be present");
            }
        } finally {
            sc.close();
        }
    }
}
