
package javaUtils.collectionsFramework.queue.linked;

import java.util.concurrent.LinkedBlockingDeque;

public class _LinkedBlockingDeque {
    public static void main(String[] args) {

        LinkedBlockingDeque<String> deque = new LinkedBlockingDeque<>();

        // Adding elements to the front
        deque.addFirst("A");
        deque.addFirst("B");

        // Adding elements to the back
        deque.addLast("C");
        deque.addLast("D");

        System.out.println(deque);

        // Removing elements from the front
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque);

        // Removing elements from the back
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}
