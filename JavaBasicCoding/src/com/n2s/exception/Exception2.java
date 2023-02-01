package com.n2s.exception;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =5;
		String s = null;
		try{
			System.out.println(s.length());
			i = 10/0;
			System.out.println(i);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
		//always super class exception will come at the end
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
