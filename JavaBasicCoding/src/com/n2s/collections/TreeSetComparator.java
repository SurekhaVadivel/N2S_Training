package com.n2s.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Login> ts = new TreeSet<>(new UnameCompare());
		ts.add(new Login("Surekha","pwd1"));
		ts.add(new Login("Kamal","pwd2"));
		ts.add(new Login("Surya","pwd3"));
		ts.add(new Login("Prathee","pwd4"));
		ts.add(new Login("Abi","pwd5"));
		
		for (Login l: ts){
			System.out.println(l);
		}
	}

}

class UnameCompare implements Comparator<Login>{

	@Override
	public int compare(Login l1, Login l2) {
		// TODO Auto-generated method stub
		return l1.getUsername().compareTo(l2.getUsername());
	}
	
}

class Login{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}
	
}