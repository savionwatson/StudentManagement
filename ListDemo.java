import java.util.ArrayList;
import java.util.List;

/** Demonstrates the use of ArrayList in Java */
public class ListDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        //add concept
        students.add(new Student(1, "Alice", "Computer Science", 3.8));
        students.add(new Student(2, "Bob", "Mathematics", 3.9));
        students.add(new Student(3, "Charlie", "Physics", 3.7));
        students.add(new Student(4, "David", "Biology", 3.6));
        students.add(new Student(5, "Eve", "Chemistry", 3.5));
        students.add(new Student(6, "Frank", "Engineering", 3.4));

        System.out.println("Original list:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for(Student student : students) {
            System.out.println(student);
        }

        //get concept
        System.out.println("\nFirst student in the list: " + students.get(0));
        
        //set concept
        Student newStudent = new Student(7, "Grace", "Psychology", 3.8);
        students.set(0, newStudent);
        System.out.println("\nList after updating the first student:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for(Student student : students) {
            System.out.println(student);
        }

        //remove concept
        students.remove(students.size() - 1);
        System.out.println("\nList after removing the last student:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for(Student student : students) {
            System.out.println(student);
        }

        //contains concept
        int idToFind = 3;
        boolean found = students.contains(new Student(idToFind, "", "", 0.0));
        System.out.println("Was the student with ID " + idToFind + " found in the list?: " + found);

        //list size concept
        System.out.println("\nList size: " + students.size());

        //isEmpty concept
        System.out.println("\nIs the list empty?: " + students.isEmpty());
    }
}
