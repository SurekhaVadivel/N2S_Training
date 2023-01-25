package com.n2s.oops;

public class Constructor {
	
	//create private constructor to restrict object creation outside of the class 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor ct = new Constructor();
		//Constructor ct1 = new Constructor(5);
		//Constructor ct2 = new Constructor("Surekha", 7);
		//Constructor ct3; //without right hand initiation it wont throw any error
		//ct1.msg();  //but with this object we can't access any method or variable until we initialize it
		
		Child ch = new Child();
	}
	
	Constructor() {
		System.out.println("Calling Constructor");
	}
	
	Constructor(int x) {
		System.out.println("Calling single parameterized Constructor: "+x);
	}
	
	Constructor(String s, int x) {
		this();
		System.out.println("Calling double parameterized Constructor: "+s+" "+x);
	}
	
	public void msg(){
		System.out.println("Hello");
	}

}


class Child extends Constructor{
	
	Child(){
		//super(); //by default constructor of super class will be called
		super(5); //constructor call should be the first statement
		System.out.println("Child class default constructor");
	}
	
}