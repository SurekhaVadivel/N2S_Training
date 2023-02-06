package com.n2s.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		
		l.add("Surekha");
		l.add("Kamal");
		l.add("Prathee");
		
		l.forEach((n) -> System.out.println(n));
	}
}
