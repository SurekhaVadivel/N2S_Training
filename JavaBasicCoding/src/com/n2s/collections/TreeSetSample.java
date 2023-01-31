package com.n2s.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//duplicate is overridden
		//ascending order
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Surekha");
		ts.add("Kamal");
		ts.add("Prathee");
		ts.add("Kamal");
		ts.add("Surya");

		Iterator<String> ir= ts.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
	}

}
