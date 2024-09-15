
package javaUtils.collectionsFramework.queue.linked;

import java.util.concurrent.LinkedBlockingQueue;

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
