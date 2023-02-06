package com.n2s.methodref;

public class StaticMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Payment p = StaticMethodRef::creditPay;
		p.pay();
	}

	public static void creditPay(){
		System.out.println("Payment using credit card");
	}
}

interface Payment{
	void pay();
}