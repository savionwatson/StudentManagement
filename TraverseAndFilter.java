import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/** Demonstrates different ways to traverse a list 
 * Also demostrate filtering with an iterator
 */
public class TraverseAndFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", "Computer Science", 3.8));
        students.add(new Student(2, "Bob", "Mathematics", 3.9));
        students.add(new Student(3, "Charlie", "Physics", 2.2));
        students.add(new Student(4, "David", "Biology", 2.6));

        //enhanced for loop concept
        //good for readability and simplicity
        System.out.println("Enhanced For Loop:");
        System.out.printf("%-10s %-20s %-20s %-6s%n", "ID", "Name", "Major", "GPA");
        for(Student student : students) {
            System.out.println(student);
        }

        //lambda concept
        //useful for applying operations to each element
        System.out.println("\nLambda only names:");
        students.forEach(student -> System.out.println(student.getName()));

        //iterator concept
        //useful for removing elements while traversing
        Iterator<Student> iterator = students.iterator();
        System.out.println("\nIterator remove student < 2.5 GPA:");
        while(iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getGpa() < 2.5) {
                iterator.remove();
            } else {
                System.out.println(student);
            }
        }

        System.out.println("\nFinal list of students:");
        students.forEach(System.out::println);
    }
}
