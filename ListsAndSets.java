import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/* Lists and Sets Example */
public class ListsAndSets {
    public static void main(String[] args) {
        Student alice = new Student(1, "Alice", "Computer Science", 3.8);
        Student bob = new Student(2, "Bob", "Mathematics", 3.9);
        Student charlie = new Student(3, "David", "Physics", 2.2);
        Student david = new Student(4, "Charlie", "Biology", 2.6);
        Student alex = new Student(1, "Alex", "Chemistry", 3.7);
        Student bailey = new Student(5, "Bailey", "Computer Science", 3.5);

        List<Student> arrayList = new ArrayList<>();
        List<Student> linkedList = new LinkedList<>();
        Set<Student> hashSet = new HashSet<>();
        Set<Student> treeSet = new TreeSet<>();

        // Array List
        // Output ordering based on insertion order, and does not remove duplicate elements
        System.out.println("ArrayList Empty: " + arrayList);
        arrayList.add(alice);
        arrayList.add(bob);
        arrayList.add(david);
        arrayList.add(charlie);
        arrayList.add(alex);
        System.out.println("\nArrayList Beginning:");
        for (Student student : arrayList) {
            System.out.println(student);
        }

        arrayList.add(bailey);
        arrayList.remove(bob);
        System.out.println("\nArrayList After Removal and Addition:");
        for (Student student : arrayList) {
            System.out.println(student);
        }

        System.out.println("\n*****************************");

        // Linked List
        // Functions the same as ArrayList but with different performance characteristics
        System.out.println("LinkedList Empty: " + linkedList);
        linkedList.add(alice);
        linkedList.add(bob);
        linkedList.add(david);
        linkedList.add(charlie);
        linkedList.add(alex);
        System.out.println("\nLinkedList Beginning:");
        for (Student student : linkedList) {
            System.out.println(student);
        }

        linkedList.add(bailey);
        linkedList.remove(bob);
        System.out.println("\nLinkedList After Removal and Addition:");
        for (Student student : linkedList) {
            System.out.println(student);
        }

        System.out.println("\n*****************************");

        // Hash Set
        // Utilizes hashCode and equals methods for storing elements
        // Output ordering is based on insertion order
        System.out.println("HashSet Empty: " + hashSet);
        hashSet.add(alice);
        hashSet.add(bob);
        hashSet.add(david);
        hashSet.add(charlie);
        hashSet.add(alex);
        System.out.println("\nHashSet Beginning:");
        for (Student student : hashSet) {
            System.out.println(student);
        }

        hashSet.add(bailey);
        hashSet.remove(bob);
        System.out.println("\nHashSet After Removal and Addition:");
        for (Student student : hashSet) {
            System.out.println(student);
        }

        // Tree Set
        // Utilizes compareTo method for ordering so elements with similar student IDs are ordered accordingly
        // Sorts elements in ascending order automatically
        System.out.println("\n*****************************");
        System.out.println("TreeSet Empty: " + treeSet);
        treeSet.add(alice);
        treeSet.add(bob);
        treeSet.add(david);
        treeSet.add(charlie);
        treeSet.add(alex);
        System.out.println("\nTreeSet Beginning:");
        for (Student student : treeSet) {
            System.out.println(student);
        }

        treeSet.add(bailey);
        treeSet.remove(bob);
        System.out.println("\nTreeSet After Removal and Addition:");
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
