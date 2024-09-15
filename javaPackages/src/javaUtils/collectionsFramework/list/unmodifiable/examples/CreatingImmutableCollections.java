
package javaUtils.collectionsFramework.list.unmodifiable.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreatingImmutableCollections {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Create an unmodifiable view of the list
        List<String> unmodifiableFruits = Collections.unmodifiableList(fruits);

        // The unmodifiable list cannot be modified
//         fruits.add("grape"); // This would throw an UnsupportedOperationException
//         unmodifiableFruits.add("grape"); // This would also throw an UnsupportedOperationException

        // However, the original list can still be modified
        fruits.add("grape");
    }
}
