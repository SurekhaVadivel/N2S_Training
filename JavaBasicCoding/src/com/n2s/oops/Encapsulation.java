package com.n2s.oops;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s = new Sample();
		s.display1();
		System.out.println(s.x);
		//InnerSample ins = new InnerSample(); //private inner class
	}

}

class Sample{
	
	public int x=5;
	private int y = 10;
	
	InnerSample ins = new InnerSample();
	
	public void display1(){
		System.out.println("Display1");
		ins.display2();
		display3();
	}
	
	private void display3(){
		System.out.println("Display3");
	}
	
	private class InnerSample{
		
		public void display2(){
			System.out.println("Display2");
		}	
	}
}