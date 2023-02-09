package com.n2s.thread;

public class SyncSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table ta = new Table();
		Thread t1 = new Thread(new Thread1(ta));
		Thread t2 = new Thread(new Thread2(ta));
		t1.start();
		t2.start();
	}

}

class Table {
	synchronized public void printTable(int i) throws InterruptedException{
		for(int j=1;j<5;j++){
			System.out.println(i+" * "+j+" = "+i*j);
			Thread.sleep(1000);
		}
	}
}

class Thread1 implements Runnable{
	Table t;

	public Thread1(Table t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.printTable(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Thread2 implements Runnable{
	Table t;

	public Thread2(Table t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			t.printTable(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}