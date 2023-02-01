package com.n2s.exception;

import java.util.Scanner;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your age: ");
		int age_v=sc.nextInt();
		
		Exception5 e5 = new Exception5();
		try{
			e5.ageValidation(age_v);
		}
		catch(InvalidAgeException ie){
			ie.printStackTrace();
		}
		finally{
			sc.close();
		}
		System.out.println("Maintaining the flow after exception");
	}

	public void ageValidation(int age) throws InvalidAgeException{
		if (age < 18){
			throw new InvalidAgeException("Not eligible to vote");
		}
		else
			System.out.println("Eligible to vote");
	}
}
