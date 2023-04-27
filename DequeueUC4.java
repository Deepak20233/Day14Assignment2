package com.java;
import java.util.LinkedList;
import java.util.Queue;
public class DequeueUC4 {

	public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements onto the queue
        queue.add(56);
        queue.add(30);
        queue.add(70);
        
        // Dequeue elements from the beginning of the queue
        while(!queue.isEmpty()) {
            System.out.println("Dequeuing: " + queue.remove());
        }
    }

}
