package javaUtils.collectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class _LinkedList {

    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();

        // Adding elements to the beginning
        animals.addFirst("cat");
        animals.addFirst("dog");

        // Adding elements to the end
        animals.addLast("elephant");
        animals.addLast("tiger");

        // Removing elements from the beginning
        System.out.println("Removed: " + animals.removeFirst());

        // Removing elements from the end
        System.out.println("Removed: " + animals.removeLast());

        // Iterating over elements
        animals.forEach(System.out::println);

        System.out.println("Animals remained: " + animals);
    }
}
