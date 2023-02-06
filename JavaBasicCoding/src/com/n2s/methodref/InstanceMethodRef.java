package com.n2s.methodref;

public class InstanceMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InstanceMethodRef imr = new InstanceMethodRef();
		Payment1 p = imr::debitPay;
		p.pay();
		
		Payment1 p1 = new InstanceMethodRef()::debitPay;
		p1.pay();
	}

	public void debitPay(){
		System.out.println("Payment using debit card");
	}
}

@FunctionalInterface
interface Payment1{
	void pay();
}