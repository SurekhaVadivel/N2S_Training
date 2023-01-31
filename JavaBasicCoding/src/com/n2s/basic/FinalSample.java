package com.n2s.basic;

public class FinalSample {

	static int y;
	static String s ;
	static final int z=10; //final variables should be initialized
	public static final int x =5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(y);
		System.out.println(s);
	}

}

final class SuperClass{
	public final void superDisplay(){
		System.out.println("Inside Super class");
	}
}