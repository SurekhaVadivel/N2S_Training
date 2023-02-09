package com.n2s.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();
		for (int i =1; i <100; i++)
		{
			l.add(i);
		}
		Stream<Integer> s1 = l.stream();
		Stream hiNum = s1.filter(p -> p > 90);
		hiNum.forEach(p -> System.out.print(p+" "));
		
		Stream<String> names = Stream.of("aBc","test","dOg");
		System.out.println(names.map(s -> {
		return s.toUpperCase();
		}).collect(Collectors.toList()));
	}

}
