package com.Collections;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {

		//Queue<Integer> pq = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		//Add elements into the queue--offer,add
		pq.add(1);
		pq.add(3);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq);
		
		//Retrieval of elements--Peek
		System.out.println(pq.peek());
		    
		//Removal of elements--Poll, remove
		
		     //poll-(removes the element which is in head and prints all other elements )
		System.out.println(pq.poll());
		  
		     // remove
		System.out.println(pq.remove());
		
		//If the list is empty, If we use remove--we get exception
		//If the list is empty, If we  use poll---we get null
		
		System.out.println(pq.contains(4));
		
		
		
	}
}
