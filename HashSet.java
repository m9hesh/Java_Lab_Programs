//7. Write a program to demonstrate Hash set and Iterator classes.
public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> myHashSet = new HashSet<>();

        // Adding elements to the HashSet
        myHashSet.add("John");
        myHashSet.add("Alice");
        myHashSet.add("Bob");
        myHashSet.add("Carol");
        myHashSet.add("David");

        // Displaying the HashSet using Iterator
        System.out.println("HashSet Elements:");
        Iterator<String> iterator = myHashSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
