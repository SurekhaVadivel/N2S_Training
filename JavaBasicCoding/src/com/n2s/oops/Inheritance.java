package com.n2s.oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C();
		c1.method3();
		c1.method2();
		c1.method1();
	}

}

class A
{
	public void method1(){
		
	}
}

class B extends A
{
	public void method2(){
		
	}
}

class C extends B
{
	public void method3(){
		
	}
}