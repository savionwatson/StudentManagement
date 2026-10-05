import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String major;
    private double gpa;

    /** Compares this student with another student based on their name
     * CollectionsDemo.java / Sorting.java
     * @param other the other student to compare with
     * @return a negative integer, zero, or a positive integer if student name is alphabetically before, equal to, or after the other student's name
     */
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    /** Checks if this student is equal to another object
     * ObjectEquality.java
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override 
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        return id == student.id;
    }

    /** Returns the hash code for this student 
     * ObjectEquality.java
     */
    @Override 
    public int hashCode() {
        return Integer.hashCode(id);
    }

    /** Constructor for creating a student with specific attributes
     * @param id the student's ID
     * @param name the student's name
     * @param major the student's major
     * @param gpa the student's GPA
     */
    Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    /** Default constructor */
    Student() {
        this(0, "", "", 0.0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /** Returns a string representation of the student */
    public String toString() {
        return String.format("%-10d %-20s %-20s %-6.2f", id, name, major, gpa);
    }

    /**
     * Reads a valid integer menu option from the user.
     * If the user enters a non-numeric value or a number outside the
     * valid menu range, the method reprompts until a valid choice is entered.
     *
     * @param scanner the Scanner used to read input from the console
     * @param min the minimum valid menu option
     * @param max the maximum valid menu option
     * @return a valid integer choice within the specified range
     */
    private static int readOption(Scanner scanner, int min, int max) {
        while (true) {
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.println("Invalid choice. Please enter a number between "
                        + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
    
    /* Calls the main method of the selected demo class */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======== STUDENT COLLECTION MANAGEMENT SYSTEM ========\n");

        System.out.println("1. B-Comparable and Natural Ordering");
        System.out.println("2. C-Object Equality - equals() and hashCode()");
        System.out.println("3. D-Working with Lists and ArrayLists");
        System.out.println("4. E/G-Traversing the Collection and Filtering with an Iterator");
        System.out.println("5. F-Sorting the Comparable and Comparator");
        System.out.println("6. H-Working with Set and HashSet");
        System.out.println("7. I-Comparing Collection Implementations");
        System.out.println("8. Exit");

        int choice = readOption(input, 1, 8);
        switch(choice) {
            case 1:
                CollectionsDemo.main(args);
                break;
            case 2:
                ObjectEquality.main(args);
                break;
            case 3:
                ListDemo.main(args);
                break;
            case 4:
                TraverseAndFilter.main(args);
                break;
            case 5:
                Sorting.main(args);
                break;
            case 6:
                SetsDemo.main(args);
                break;
            case 7:
                ListsAndSets.main(args);
                break;
            case 8:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
