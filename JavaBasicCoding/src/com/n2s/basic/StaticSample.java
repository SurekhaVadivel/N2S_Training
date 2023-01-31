package com.n2s.basic;

public class StaticSample {
	static int x = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Inside main method");
		X.display2();
		display1();
		//to access variable inside static method, it should be static variable
		System.out.println("2. x value: "+x);
	}
	
	public static void display1(){
		System.out.println("3. Inside static display1 method");
		x=12;
	}
	
	static class X{
		public static void display2(){
			System.out.println("4. Inside static inner class display2 method");
			x=4;
		}
	}

	//static block will be executed before main program
	static{
		System.out.println("5. Inside static anonymous block");
		x=21;
	}
}
