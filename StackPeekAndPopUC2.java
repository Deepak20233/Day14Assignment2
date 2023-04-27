package com.java;
import java.util.Stack;
public class StackPeekAndPop {

	public static void main(String[] args) {
		 Stack<Integer> stack = new Stack<>();
	        
	        // Push elements onto the stack
	        stack.push(56);
	        stack.push(30);
	        stack.push(70);
	        
	        // Peek and pop elements from the stack until it is empty
	        while(!stack.isEmpty()) {
	            System.out.println("Peeking: " + stack.peek());
	            System.out.println("Popping: " + stack.pop());
	        }
	    }
	

	}
