//8. Write a program to demonstrate Enumeration and Comparator interiaces

import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationComparatorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> myVector = new Vector<>();

        // Adding elements to the Vector
        myVector.add("John");
        myVector.add("Alice");
        myVector.add("Bob");
        myVector.add("Carol");
        myVector.add("David");

        // Displaying the Vector using Enumeration
        System.out.println("Vector Elements:");
        Enumeration<String> enumeration = myVector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // Sorting the Vector using a Comparator
        myVector.sort(new MyComparator());

        // Displaying the sorted Vector using Enumeration
        System.out.println("Sorted Vector Elements:");
        enumeration = myVector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }

    // Defining a custom Comparator
    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            return s1.compareTo(s2);
        }
    }
}

