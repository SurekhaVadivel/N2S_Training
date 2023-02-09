package com.n2s.thread;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer();
		Thread t1 = new Thread(){
			public void run(){
				try {
					c.withdraw(15000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
					c.deposit(10000);
			}
		};
		
		t1.start();
		t2.start();
	}

}

class Customer{
	public static int balance = 10000;
	
	synchronized void withdraw(int amount) throws InterruptedException{
		if (balance < amount){
			System.out.println("Less balance, waiting for deposit");
			wait();
			balance += amount;
			System.out.println("Withdrawal completed");
		}
	}
	
	synchronized void deposit(int amt){
		System.out.println("Depositing the amount");
		balance += amt;
		System.out.println("Deposit completed");
		notify();
	}
}