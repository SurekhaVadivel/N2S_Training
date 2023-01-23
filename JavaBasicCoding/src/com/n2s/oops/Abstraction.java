package com.n2s.oops;

public class Abstraction extends Calc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		if (x>y){
			return x-y;
		}
		else{
			return y-x;
		}
	}

}

abstract class Calc{
	public abstract int add(int x, int y);
	
	public abstract int sub(int x, int y);
	
	public int mult(int x, int y){
		return x*y;
	}
}