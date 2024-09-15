
package javaUtils.collectionsFramework.list.unmodifiable.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProtectingSharedData {

    public static void main(String[] args) {

        List<Integer> sharedData = new ArrayList<>();

        sharedData.add(1);
        sharedData.add(2);
        sharedData.add(3);

        // Create an unmodifiable view of the shared data
        List<Integer> unmodifiableSharedData = Collections.unmodifiableList(sharedData);

        // Multiple threads can safely access the unmodifiable view
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: " + unmodifiableSharedData);
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2: " + unmodifiableSharedData);
        });

        thread1.start();
        thread2.start();

        // Throwing error whereas Collections.unmodifiableList does not allow modifications
        //unmodifiableSharedData.add(4);
    }
}
