package com.n2s.methodref;

public class ConstructorMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Message m = Display::new;
		m.getMsg("Hello");
				
	}

}

class Display {
	Display(String msg){
		System.out.println(msg);
	}
}
interface Message
{
	Display getMsg(String msg);
}