package ch7;

import java.time.LocalTime;
import java.util.Scanner;

public class Assistant {
    // I don't like the book proposing a project that uses classes/objects without
    // teaching about it, so I'm just going to ignore some instructions and create
    // my own project.
    public static void main(String[] args) {
        startMenu();
    }

    public static void startMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Security");
        System.out.println("Choose what to do:");
        System.out.println("1 - Check hours");
        System.out.println("2 - Check guest count");
        System.out.println("3 - Greet a guest");
        System.out.println("0 - Exit");
        int choice = sc.nextInt();
        handleMenuChoice(choice);
        sc.close();
    }

    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                checkHours();
                startMenu();
            case 2:
                checkGuestCount();
                startMenu();
            case 3:
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter guest name --> ");
                String guestName = sc.next();
                greetGuest(guestName);
                startMenu();
            case 0:
                System.exit(0);
        }
    }

    public static void checkHours() {
        LocalTime openingHours = LocalTime.parse("10:00");
        LocalTime closingHours = LocalTime.parse("19:00");
        LocalTime time = LocalTime.now();
        int opened = time.compareTo(openingHours);
        int closed = time.compareTo(closingHours);
        boolean parkOpen = (opened > 0) && (closed <= 0);
        if(parkOpen){
            System.out.println("It's " + time + ".");
        } else {
            System.out.println("It's " + time + ".");
        }
    }

    public static void checkGuestCount(){
        int guestCount = (int) (Math.random() * 500);
        System.out.println(guestCount + " guests");
    }

    public static void greetGuest(String guestName){
        System.out.println("Welcome to Mesozoic Eden, " + guestName + "! Have a great time!");
    }
}
