package ders07.konu01;

import java.util.TreeMap;

/*
-Sorted Keys: Automatically arranges keys in ascending order.
-Efficient Retrieval: Provides O(log n) time complexity for get(),
put(), and remove() operations.
-NavigableMap Interface: Supports advanced methods like higherKey(),
lowerKey(), firstEntry(), and lastEntry().
-No null Keys: Unlike HashMap, TreeMap does not allow null keys but allows null values.
-Red-Black Tree Implementation: It ensures a balanced tree structure for efficient
lookup and insertion.
* */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Alice");
        students.put(103, "Bob");
        students.put(102, "Charlie");

        System.out.println("TreeMap: " + students); // {101=Alice, 102=Charlie, 103=Bob}
        System.out.println("First Entry: " + students.firstEntry()); // 101=Alice
        System.out.println("Last Key: " + students.lastKey()); // 103
    }
}

