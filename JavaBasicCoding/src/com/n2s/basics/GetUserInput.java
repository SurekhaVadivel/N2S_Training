package com.n2s.basics;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String name = sc.next();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Name: "+name+" - Age: "+ age);
		
		sc.close();
	}

}
