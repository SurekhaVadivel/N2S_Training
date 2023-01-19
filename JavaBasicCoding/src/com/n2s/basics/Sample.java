package com.n2s.basics; //should be the first statement

public class Sample {

	//static method can be accessed without object
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Surekha");
		System.out.println("Arguments: "+args[0] + " "+ args[1]);
		for (int i =0; i<args.length; i++)
		{
			System.out.println(args[i] );
		}
		Sample s = new Sample();
		int a=s.add(4,5);
		System.out.println(a);
		int b=sub(4,9); //calling static method
		System.out.println(b);
		
	}
	
	public int add(int x, int y){
		return x+y;
	}
	
	public static int sub(int x, int y){
		if (x > y){
			return x-y;
		}
		else {
			return y-x;
		}
		
	}

}

 class Example{  //default class
	
}

//for each and every class, .class file will be generated in bin directory