package com.n2s.oops;

public interface Ifc1 {
	
	public static final int ifc1_x = 5; //default variable is final only, even without final keyword
	public abstract int add(int x, int y);  //default method is abstract, even without abstract keyword
	
	//method with body should be created with default or static keyword
	public default void test1(){
		
	}
	
	public static void test2(){
		
	}
	
	//private method is allowed from Java9 version
	/*private void test3(){	
	}*/

}
