package com.n2s.collections;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vt = new Vector<String>();
		vt.add("Surekha");
		vt.add("Kamal");
		vt.add("Prathee");
		vt.add("Kamal");
		vt.add("Surya");
		vt.addElement("Ammu"); //only available for vector
		
		//vector is synchronized
		//enumeration is only available for vector
		Enumeration<String> e = vt.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
