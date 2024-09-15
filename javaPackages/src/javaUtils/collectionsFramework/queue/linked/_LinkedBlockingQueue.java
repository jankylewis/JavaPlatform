
package javaUtils.collectionsFramework.queue.linked;

import java.util.concurrent.LinkedBlockingQueue;

// Blocking operations: When the queue is empty, take() blocks until an element is available.
// When the queue is full, put() blocks until an element can be added.
public class _LinkedBlockingQueue {

    public static void main(String[] args)
    {
        LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Producer thread
        new Thread(() -> {
            try {
                queue.put("A");
                queue.put("B");
                queue.put("C");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer thread
        new Thread(() -> {
            try {
                System.out.println(queue.take());
                System.out.println(queue.take());
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
