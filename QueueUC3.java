package com.java;
import java.util.LinkedList;
import java.util.Queue;
public class QueueUC3 {
	public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<>();
    
    // Enqueue elements onto the queue
    queue.add(56);
    queue.add(30);
    queue.add(70);
    
    // Print the elements in the queue
    System.out.println("Elements in queue: " + queue);

}
}

