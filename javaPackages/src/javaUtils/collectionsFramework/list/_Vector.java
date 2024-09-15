package javaUtils.collectionsFramework.list;

import java.util.Vector;

public class _Vector {

    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Adding elements
        numbers.add(1);

        numbers.add(2);
        numbers.add(3);

        // Iterating over elements
        numbers.forEach(System.out::println);
    }
}
