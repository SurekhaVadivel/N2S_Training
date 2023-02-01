package com.n2s.exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		int i=20;
		i=20/0;
		
		System.out.println("i = "+i);
		}
		catch( ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("Welcome");
	}

}
