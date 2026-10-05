import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/** Demonstrates sorting of Student objects using different comparators */
public class Sorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(5, "Alice", "Computer Science", 2.9));
        students.add(new Student(4, "Bob", "Mathematics", 3.8));

        Collections.sort(students);
        System.out.println("Name A to Z:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for (Student student : students) {
            System.out.println(student);
        }

        Comparator<Student> byGPA = (s1, s2) -> Double.compare(s1.getGpa(), s2.getGpa());
        Collections.sort(students, byGPA);

        System.out.println("\nStudents sorted by GPA low to high:");
        for (Student student : students) {
            System.out.println(student);
        }

        Comparator<Student> byID = (s1, s2) -> Integer.compare(s1.getId(), s2.getId());
        Collections.sort(students, byID);

        System.out.println("\nStudents sorted by ID:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}