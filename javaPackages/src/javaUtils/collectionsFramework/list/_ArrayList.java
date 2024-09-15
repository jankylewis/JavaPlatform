package javaUtils.collectionsFramework.list;

import java.util.ArrayList;
import java.util.List;

public class _ArrayList {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Checking size
        System.out.println("Size of the collection: " + fruits.size());

        // Iterating over elements
        fruits.forEach(System.out::println);

        // Removing an element
        fruits.remove("banana");

        // Checking if an element exists
        System.out.println("Does the collection contain 'apple'? " + fruits.contains("apple"));
    }
}
