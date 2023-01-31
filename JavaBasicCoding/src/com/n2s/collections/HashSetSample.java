package com.n2s.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Surekha");
		hs.add("Kamal");
		hs.add("Prathee");
		hs.add("Kamal");
		hs.add("Surya");

		Iterator<String> ir= hs.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
	}

}
