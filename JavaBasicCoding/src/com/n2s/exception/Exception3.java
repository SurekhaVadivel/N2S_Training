package com.n2s.exception;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int i = 20 /0;
			System.out.println(i);
		}
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}
		//will execute always
		finally{
			System.out.println("Finally always gets executed");
		}
		//if catch block is not there, this wont execute
		System.out.println("Maintaining the flow after exception");
	}

}
