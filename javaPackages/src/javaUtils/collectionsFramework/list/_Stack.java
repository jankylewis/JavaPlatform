
package javaUtils.collectionsFramework.list;

import java.util.Stack;

public class _Stack {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        // Pushing elements onto the stack
        books.push("Java Programming");
        books.push("Clean Code");
        books.push("Effective Java");

        // Peeking at the top element without removing it
        System.out.println("Top book: " + books.peek());

        // Popping elements from the stack
        System.out.println("Popped: " + books.pop());
        System.out.println("Popped: " + books.pop());

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + books.empty());

        System.out.println(books);
    }
}