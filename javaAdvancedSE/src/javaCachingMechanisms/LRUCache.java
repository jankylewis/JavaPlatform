package javaCachingMechanisms;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

    private final int capacity;
    private final Map<Integer, Node> cache;
    private final DoublyLinkedList dll;

    // Node class for doubly linked list
    private class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Doubly linked list to maintain the order of LRU items
    private class DoublyLinkedList {
        Node head;
        Node tail;

        DoublyLinkedList() {
            head = new Node(0, 0);  // Dummy head
            tail = new Node(0, 0);  // Dummy tail
            head.next = tail;
            tail.prev = head;
        }

        void addNodeToHead(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        Node removeTail() {
            Node last = tail.prev;
            removeNode(last);
            return last;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.dll = new DoublyLinkedList();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;

        Node node = cache.get(key);
        dll.removeNode(node);      // Remove the node from its current position
        dll.addNodeToHead(node);    // Move the node to the head (most recently used)
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node existingNode = cache.get(key);
            existingNode.value = value;
            dll.removeNode(existingNode);
            dll.addNodeToHead(existingNode);
        } else {
            if (cache.size() >= capacity) {
                Node leastUsed = dll.removeTail();
                cache.remove(leastUsed.key);  // Remove the least recently used entry from cache
            }
            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            dll.addNodeToHead(newNode);
        }
    }

    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, 100);
        lruCache.put(2, 200);
        lruCache.put(3, 300);
        System.out.println(lruCache.get(1)); // Output: 100
        lruCache.put(4, 400); // Removes key 2 as it's least recently used
        System.out.println(lruCache.get(2)); // Output: -1
    }
}
