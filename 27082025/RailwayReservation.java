import java.util.Scanner;

public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seats = 5;  
	int waitingList = 3;
        int booked = 0, waitlisted = 0;

        System.out.println("Welcome to Railway Reservation System!");
        System.out.println("Choose your Train:");
        System.out.println("1. Express - Fare: 500");
        System.out.println("2. Superfast - Fare: 800");
        System.out.println("3. Rajdhani - Fare: 1200");

        int choice = sc.nextInt();
        int fare = 0;

        switch (choice) {
            case 1:
                fare = 500;
                System.out.println("You chose Express Train.");
                break;
            case 2:
                fare = 800;
                System.out.println("You chose Superfast Train.");
                break;
            case 3:
                fare = 1200;
                System.out.println("You chose Rajdhani Train.");
                break;
            default:
                System.out.println("Invalid choice, defaulting to Express (500).");
                fare = 500;
        }


        do {
            System.out.print("\nEnter number of passengers to book: ");
            int passengers = sc.nextInt();


            for (int i = 1; i <= passengers; i++) {
                if (booked < seats) {  // seat available
                    booked++;
                    System.out.println("Passenger " + i + " booked successfully! Fare: " + fare);
                } else if (waitlisted < waitingList) { // add to waiting list
                    waitlisted++;
                    System.out.println("Passenger " + i + " added to waiting list.");
                } else { // no space
                    System.out.println("Sorry! Passenger " + i + " cannot be booked. Train full.");
                }
            }
            if (booked >= seats && waitlisted >= waitingList) {
                System.out.println("\nAll seats and waiting list are full. Booking closed!");
                break;
            }

            System.out.print("\nDo you want to make another booking? (yes/no): ");
        } while (sc.next().equalsIgnoreCase("yes"));

        System.out.println("Booking Summary ---");
        System.out.println("Seats Booked: " + booked);
        System.out.println("Waiting List: " + waitlisted);
        System.out.println("Total Collection: " + (booked * fare));
    }
}
