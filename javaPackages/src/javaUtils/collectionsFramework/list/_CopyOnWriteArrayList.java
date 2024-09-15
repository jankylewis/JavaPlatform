
package javaUtils.collectionsFramework.list;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class _CopyOnWriteArrayList {

    public static void main(String[] args) {
        List<String> fruits = new CopyOnWriteArrayList<>();

        // Adding elements
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Iterating over elements
        fruits.forEach(System.out::println);

        // Modifying the list while iterating
        new Thread(() -> {
            fruits.add("grape");
            fruits.add("mango");
        }).start();

        // The iterator will not be affected by the modification
        fruits.forEach(System.out::println);
    }
}
