package com.n2s.oops;

public class MethodOverRiding extends SuperRiding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverRiding mo = new MethodOverRiding();
		mo.msg();
	}

	public void msg(){
		System.out.println("Running from MethodOverRiding");
		super.msg();
	}
}

class SuperRiding{
	public void msg(){
		System.out.println("Running from SuperRiding");
	}
}