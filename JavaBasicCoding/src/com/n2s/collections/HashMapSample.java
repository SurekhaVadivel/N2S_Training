package com.n2s.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unique key 
		//duplicate values are  allowed
		//it will not sort the key
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(101, "Surekha");
		hm.put(102, "Kamal");
		hm.put(103, "Prathee");
		hm.put(null, "Surya");
		hm.put(null, null);
		hm.put(100, null);
		
		for(Map.Entry<Integer, String> me:hm.entrySet())
		{
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}

}
