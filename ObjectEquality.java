import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

/** Demonstrates use of object equality and hash codes */
public class ObjectEquality {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice", "Computer Science", 3.8);
        Student student2 = new Student(1, "Alice", "Biology", 3.8);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);

        System.out.println("List:");
        for(Student student : list) {
            System.out.println(student);
        }

        System.out.println("\nHashSet:");
        for(Student student : hashSet) {
            System.out.println(student);
        }   

        System.out.println("\nDoes student1 equal student2?: " + student1.equals(student2));
        System.out.println("Is hashCode of student1 equal to hashCode of student2?: " + 
                            (student1.hashCode() == student2.hashCode()));
        System.out.println("\nList size: " + list.size());
        System.out.println("HashSet size: " + hashSet.size());
    }
}
