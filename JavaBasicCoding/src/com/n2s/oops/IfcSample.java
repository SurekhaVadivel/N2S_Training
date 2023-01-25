package com.n2s.oops;

public class IfcSample implements Ifc1, Ifc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfcSample ifs = new IfcSample();
		Ifc1.test2(); //static method is called directly with interface name
		ifs.test1();  //default method is called using object
		System.out.println(ifs.add(ifc1_x, ifc1_x));
		//ifc1_x = 4;  //final variable can't be changed
		
		//create object for interface with anonymous inner type
/*		Ifc2 ifc2= new Ifc2() {
			
			@Override
			public int mult(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int sub(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
*/
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		if (x > y){
			return x-y;
		}
		else{
			return y-x;
		}
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
	
	
}
