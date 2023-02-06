package com.n2s.lambda;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleParam sp = name -> {System.out.println("Name is : "+name); };
		sp.displayName("Surekha");
		
		DoubleParam dp = (a, b) -> { return (a+b);
		};
		System.out.println(dp.add(4, 5));
	}

}

@FunctionalInterface
interface SingleParam {
	
	public abstract void displayName(String name);
}

@FunctionalInterface
interface DoubleParam{
	public abstract int add (int a, int b);
}