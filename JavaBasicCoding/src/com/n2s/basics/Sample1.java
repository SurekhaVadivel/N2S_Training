package com.n2s.basics;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Adding to GitHub");
		Sample s1= new Sample();
		System.out.println("Value of Age variable: "+s1.age);
		System.out.println("Calling add method: "+s1.add(6, 2));
		
		System.out.println("Calling sub method: "+Sample.sub(6,2)); //Calling static method using class_name.method
		
		Example e1= new Example(); //default class accessed inside the same package
		System.out.println("Calling mul method of default class: "+e1.mul(4, 5));
	}

}
