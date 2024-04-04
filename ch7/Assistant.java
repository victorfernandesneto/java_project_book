package ch7;

import java.time.LocalTime;
import java.util.Scanner;

public class Assistant {
    // I don't like the book proposing a project that uses classes/objects without
    // teaching about it, so I'm just going to ignore some instructions and create
    // my own project.
    public static void main(String[] args) {
        int guests = 0;
        startMenu(guests);
    }

    public static void startMenu(int guests) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Security");
        System.out.println("Choose what to do:");
        System.out.println("1 - Check hours");
        System.out.println("2 - Check guest count");
        System.out.println("3 - Check-in guests");
        System.out.println("4 - Check-out guests");
        System.out.println("5 - Greet a guest");
        System.out.println("0 - Exit");
        int choice = sc.nextInt();
        handleMenuChoice(choice, guests);
        sc.close();
    }

    public static void handleMenuChoice(int choice, int guests) {
        Scanner sc = new Scanner(System.in);
        int guestQuantity = 0;
        switch (choice) {
            case 1:
                checkHours();
                startMenu(guests);
            case 2:
                printGuestCount(guests);
                startMenu(guests);
            case 3:
                System.out.print("Enter how many guests --> ");
                guestQuantity = sc.nextInt();
                guests = checkInGuest(guests, guestQuantity);
                printGuestCount(guests);
                startMenu(guests);
            case 4:
                System.out.print("Enter how many guests --> ");
                guestQuantity = sc.nextInt();
                guests = checkOutGuest(guests, guestQuantity);
                printGuestCount(guests);
                startMenu(guests);
            case 5:
                System.out.print("Enter guest name --> ");
                String guestName = sc.next();
                greetGuest(guestName);
                startMenu(guests);
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

    public static void printGuestCount(int guests){
        System.out.println("------\nGuests: " + guests + "\n------");
    }

    public static int checkInGuest(int guests, int guestsQuantity){
        if(guests+guestsQuantity > 500) {
            System.out.println("Maximum capacity reached, wait in line.");
            return guests;
        } else {
            return guests + guestsQuantity;
        }
    }

    public static int checkOutGuest(int guests, int guestsQuantity){
        if(guests-guestsQuantity < 0) {
            System.out.println("Impossible check-out");
            return guests;
        } else {
            return guests-guestsQuantity;
        }
    }

    public static void greetGuest(String guestName){
        System.out.println("Welcome to Mesozoic Eden, " + guestName + "! Have a great time!");
    }
}