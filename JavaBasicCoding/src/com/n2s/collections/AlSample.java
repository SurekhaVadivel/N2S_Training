package com.n2s.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class AlSample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Surekha");
		al.add("Kamal");
		al.add("Prathee");
		al.add("Kamal");
		al.add("Surekha");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Surekha");
		al2.add("Kamal");
		
		//add complete list
		al.addAll(al2);
		
		//System.out.println(al);
		
		//to iterate the list..only forward direction
		//Binary search algorithm
		Iterator<String> ir= al.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
	}
}
