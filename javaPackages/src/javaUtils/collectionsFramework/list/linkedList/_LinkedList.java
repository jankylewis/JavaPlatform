package javaUtils.collectionsFramework.list.linkedList;

import java.util.LinkedList;
import java.util.List;

public class _LinkedList {

    public static void main(String[] args) {
        List<String> animals = new LinkedList<>();

        // Adding elements to the beginning
        animals.addFirst("cat");
        animals.addFirst("dog");

        System.out.println("Animals added first: " + animals);

        // Adding elements to the end
        animals.addLast("elephant");
        animals.addLast("tiger");

        System.out.println("Animals added last: " + animals);

        // Removing elements from the beginning
        System.out.println("Removed: " + animals.removeFirst());

        // Removing elements from the end
        System.out.println("Removed: " + animals.removeLast());

        // Iterating over elements
        animals.forEach(System.out::println);

        System.out.println("Animals remained: " + animals);
    }
}
