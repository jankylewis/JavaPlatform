
package javaUtils.collectionsFramework.queue.linked;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWithLinkedList {

    public static void main(String[] args) {

        Queue<String> tasks = new LinkedList<>();

        // Enqueueing elements
        tasks.offer("Task 1");
        tasks.offer("Task 2");
        tasks.offer("Task 3");

        // Dequeueing elements
        System.out.println("Dequeued: " + tasks.poll());
        System.out.println("Dequeued: " + tasks.poll());

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + tasks.isEmpty());
    }
}
