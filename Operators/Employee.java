public class Employee {
    // Static members
    private static String companyName = "TechNova Solutions";
    private static int totalEmployees = 0;

    // Instance members
    private String name;
    private final int id; // Final ensures immutability
    private String designation;

    // Constructor using 'this'
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment count on each new employee
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }

    // Static method using instanceof to verify and display
    public static void showIfEmployee(Object obj) {
        if (obj instanceof Employee) {
            Employee e = (Employee) obj;
            e.displayDetails();
        } else {
            System.out.println("Not a valid Employee object.");
        }
    }
}
