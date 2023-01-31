package com.n2s.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it wont allow null key, it will throw NullPointer Exception
		//it will sort the key
		//multiple nulls are allowed in the value 
		TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
		tm.put(105, "Surekha");
		tm.put(104, "Kamal");
		tm.put(103, "Prathee");
		tm.put(102, "Surya");
		tm.put(101, null);
		tm.put(100, null);
		
		for(Map.Entry<Integer, String> me:tm.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}

}
