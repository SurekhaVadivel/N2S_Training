package com.n2s.oops;

public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading mo = new MethodOverLoading();
		System.out.println(mo.meth("Hello ","Surekha"));
		System.out.println(mo.meth(5,6));
		System.out.println(mo.meth(5,6,7));
		System.out.println(mo.meth(5.25f,6.50f));

	}

	public int meth(int x, int y){
		return x+y;
	}
	
	public int meth(int x, int y, int z){
		return x+y+z;
	}
	
	public float meth(float x, float y){
		return x+y;
	}
	
	public String meth(String x, String y){
		return x+y;
	}
}
