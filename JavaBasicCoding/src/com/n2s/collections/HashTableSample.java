package com.n2s.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashtable wont allow null in both key and value
		//Hashtable is synchronized, so its slow, thread safe
		Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
		ht.put(105, "Surekha");
		ht.put(104, "Kamal");
		ht.put(103, "Prathee");
		ht.put(102, "Surya");
		//ht.put(101, null);
		//ht.put(100, null);
		
		for(Map.Entry<Integer, String> me:ht.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}

}
