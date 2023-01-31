package com.n2s.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first in first out
		//won't maintain insert order
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Surekha");
		pq.add("Kamal");
		pq.add("Prathee");
		pq.add("Abi");
		pq.add("Dhan");
		
		Iterator<String> ir= pq.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		System.out.println("Head: "+pq.element()); //it throws NoSuchElementException if the list is empty
		System.out.println("Peek: "+pq.peek()); //if the list is empty it returns null
		
		pq.remove(); //it throws NoSuchElementException if the list is empty
		pq.poll();   //if the list is empty it returns null
		
		System.out.println("After removing 2 elements:");
		
		Iterator<String> ir1= pq.iterator();
		while(ir1.hasNext()){
			System.out.println(ir1.next());
		}
		
	}

}
