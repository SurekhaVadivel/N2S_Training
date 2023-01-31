package com.n2s.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayDeque class is derived from Deque interface
		//Interface is anonymous inner class, so we cant initiate the object
		//we can add or remove from both ends
		Deque<String> dq=new ArrayDeque<String>();
		dq.offer("Surekha");
		dq.offer("Kamal");
		dq.offer("Prathee");
		dq.add("Surya");
		dq.offerFirst("Abi");
		dq.offerLast("Dhan");
		dq.offer("Avi");
		dq.offerFirst("James");
		
		for(String s: dq){
			System.out.println(s);
		}
		
		dq.pollLast();
		System.out.println("================");
		
		for(String s: dq){
			System.out.println(s);
		}
		
	}

}
