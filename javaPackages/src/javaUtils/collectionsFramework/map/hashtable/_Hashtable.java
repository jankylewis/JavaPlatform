package javaUtils.collectionsFramework.map.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class _Hashtable {
 
    public static void main(String[] args) {

        // Create and populate Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        hashtable.put(1, "Red");
        hashtable.put(2, "Green");
        hashtable.put(3, "Blue");
        
        // Iterate over keys
        Enumeration<Integer> keys = hashtable.keys();
        
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }

    // public static void main(String[] args) {
        
    //     // Create a thread-safe Hashtable
    //     Hashtable<String, String> hashtable = new Hashtable<>();

    //     // Runnable task to add elements
    //     Runnable addTask = () -> {
    //         for (int i = 0; i < 5; i++) 
    //             hashtable.put("Thread1-Key" + i, "Value" + i);
    //     };

    //     // Runnable task to retrieve elements
    //     Runnable retrieveTask = () -> {
    //         for (int i = 0; i < 5; i++) 
    //             System.out.println("Thread2 retrieved: " + hashtable.get("Thread1-Key" + i));
    //     };

    //     // Start threads
    //     Thread thread1 = new Thread(addTask);
    //     Thread thread2 = new Thread(retrieveTask);

    //     thread1.start();
    //     thread2.start();
    // }
}
