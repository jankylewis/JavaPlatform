package javaUtils.collectionsFramework.map.hashtable;

import java.util.HashMap;
import java.util.Map;

public class HashtableThreadSafety {

    public static void main(String[] args) {
        
        // Creating a thread-safe Hashtable
        Map<Integer, String> hashtable = new HashMap<>();
        
        // Adding some entries in the hashtable
        hashtable.put(1, "Thread-1");
        hashtable.put(2, "Thread-2");
        hashtable.put(3, "Thread-3");

        // Creating multiple threads that will access the hashtable
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 accessing hashtable: " + hashtable.get(1));
            hashtable.put(4, "Thread-1 updated");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 accessing hashtable: " + hashtable.get(2));
            hashtable.put(5, "Thread-2 updated");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 accessing hashtable: " + hashtable.get(3));
            hashtable.put(6, "Thread-3 updated");
        });

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for the threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final state of the hashtable
        System.out.println("Final Hashtable: " + hashtable);
    }
}