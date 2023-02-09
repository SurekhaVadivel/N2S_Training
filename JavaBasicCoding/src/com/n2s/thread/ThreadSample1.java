package com.n2s.thread;

public class ThreadSample1 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadSample1 ts = new ThreadSample1();
		Thread t1 = new Thread(ts);
		t1.start();
		for (int i =0;i<5;i++){
			System.out.println("Inside main method");
			Thread.sleep(1000);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i =0;
		while (i < 5){
			System.out.println("Thread is running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

}
