import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean centerOpen = true;
        System.out.println("🏋 Welcome to Fitness Center Membership System 🏋");

        while (centerOpen) {
            do {
                System.out.print("\nEnter number of members to register: ");
                int members = sc.nextInt();

                for (int i = 1; i <= members; i++) {
                    System.out.println("\nRegistering Member " + i);

                    System.out.println("Choose Membership Type:");
                    System.out.println("1. Monthly - ₹1000");
                    System.out.println("2. Quarterly - ₹2500");
                    System.out.println("3. Yearly - ₹9000");
                    int choice = sc.nextInt();

                    int fee = 0;
                    switch (choice) {
                        case 1:
                            fee = 1000;
                            System.out.println("Selected Monthly Membership.");
                            break;
                        case 2:
                            fee = 2500;
                            System.out.println("Selected Quarterly Membership.");
                            break;
                        case 3:
                            fee = 9000;
                            System.out.println("Selected Yearly Membership.");
                            break;
                        default:
                            System.out.println("Invalid choice! Defaulting to Monthly (₹1000).");
                            fee = 1000;
                    }

                    System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                    String discountInput = sc.next();
                    if (discountInput.equalsIgnoreCase("yes")) {
                        fee -= fee * 0.2;
                        System.out.println("✅ Discount applied! New Fee: ₹" + fee);
                    } else {
                        System.out.println("No discount. Fee: ₹" + fee);
                    }

                    System.out.println("🎟 Member " + i + " Registered Successfully. Final Fee: ₹" + fee);
                }

                System.out.print("\nDo you want to register more members? (yes/no): ");
            } while (sc.next().equalsIgnoreCase("yes"));

            System.out.print("\nShould the center remain open for more registrations? (yes/no): ");
            String open = sc.next();
            if (open.equalsIgnoreCase("no")) {
                centerOpen = false;
                System.out.println("\n⛔ Center is now closed. No more registrations allowed.");
            }
        }

        System.out.println("\n--- Thank You for Using Fitness Center Membership System ---");
    }
}
