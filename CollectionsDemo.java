import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Demonstrates the use of collections and sorting */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Zach", "Computer Science", 3.8));
        students.add(new Student(2, "Marsha", "Mathematics", 3.9));
        students.add(new Student(3, "Charlie", "Physics", 3.7));

        System.out.println("Original list:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for(Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("\nName A to Z:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
