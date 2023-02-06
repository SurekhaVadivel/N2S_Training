package com.n2s.lambda;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = () -> {System.out.println("Thread is running");};

		Thread t = new Thread(r);
		t.start();
	}

}
