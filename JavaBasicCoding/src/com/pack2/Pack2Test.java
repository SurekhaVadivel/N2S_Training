package com.pack2;

import com.pack1.PackSample1;

public class Pack2Test extends PackSample1{
	
	public static void main(String[] args) {
		PackSample1 ps = new PackSample1();
		ps.method1(); 
		//protected methods are not accessed outside package
		
		Pack2Test obj = new Pack2Test();
		obj.method1();
		obj.method2();
	}

}
