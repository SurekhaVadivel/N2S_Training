package com.n2s.methodref;

public class StaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment p = StaticMethodRef::creditPay;
		p.pay();
		
		Dummy d = StaticMethodRef::testDummy;
		d.test("Hello");
	}

	public static void creditPay(){
		System.out.println("Payment using credit card");
	}
	
	public static void testDummy(String s){
		System.out.println(s);
	}
}

interface Payment{
	void pay();
}

interface Dummy{
	void test(String s);
}