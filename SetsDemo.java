import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/* Demonstration of Sets */
public class SetsDemo {
    public static void main(String[] args) {
        List<Student> candidates = new ArrayList<>();
        candidates.add(new Student(1, "Alice", "Computer Science", 3.8));
        candidates.add(new Student(2, "Bob", "Mathematics", 3.9));
        candidates.add(new Student(3, "Charlie", "Physics", 2.2));
        candidates.add(new Student(4, "David", "Biology", 2.6));
        candidates.add(new Student(1, "Alex", "Computer Science", 3.8));

        Set<Student> studentSet = new HashSet<>();
        List<Student> studentList = new ArrayList<>();
        for (Student student : candidates) {
            if (!studentSet.add(student)) {
                System.out.println(student.getName() + " was not added to the set (duplicate ID)");
            }
            studentList.add(student);
        }

        Student alice = candidates.get(0);
        Student alex = candidates.get(4);
        System.out.println("\nAlice equals Alex: " + alice.equals(alex));
        System.out.println("Alice and Alex have the same hash code: "
                + (alice.hashCode() == alex.hashCode()));
        System.out.println("HashSet size: " + studentSet.size());
        System.out.println("ArrayList size: " + studentList.size());

        System.out.println("Students in the set:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for (Student student : studentSet) {
            System.out.println(student);
        }

        System.out.println("\nStudents in the ArrayList:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
