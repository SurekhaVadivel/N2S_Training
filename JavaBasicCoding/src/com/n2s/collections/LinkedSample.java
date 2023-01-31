package com.n2s.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Surekha");
		ll.add("Kamal");
		ll.add("Prathee");
		ll.add("Kamal");
		ll.add("Surya");
		
		ListIterator<String> li=ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("=======================");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
	}

}
