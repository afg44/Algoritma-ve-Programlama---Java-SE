package ders07.konu01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        // Example with ArrayList
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));
        System.out.println("ArrayList iteration:");
        iterateCollection(fruits);

        // Example with HashSet
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("\nHashSet iteration:");
        iterateCollection(numbers);

        // Example with element removal during iteration
        List<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("\nRemoving elements during iteration:");
        removeDuringIteration(colors);
    }

    // Generic method to iterate any Iterable collection
    public static void iterateCollection(Iterable<?> collection) {
        Iterator<?> iterator = collection.iterator();

        while(iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }

    // Method demonstrating safe removal during iteration
    public static void removeDuringIteration(List<String> list) {
        System.out.println("Original list: " + list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String color = iterator.next();
            if (color.startsWith("B")) {
                iterator.remove(); // (the only) safe way to remove during iteration
                System.out.println("Removed: " + color);
            }
        }

        System.out.println("Modified list: " + list);
    }
}