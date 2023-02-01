package com.n2s.collections;

import java.util.Map;
import java.util.TreeSet;

public class TreeSetComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//JavaBeans jb = new JavaBeans("Surekha", 30); 
		//jb.setAge(32);
		//System.out.println(jb.getName()+"  " +jb.getAge());
		
		TreeSet<User> ts= new TreeSet<>();
		ts.add(new User("Surekha"));
		ts.add(new User("Kamal"));
		ts.add(new User("Prathee"));
		ts.add(new User("Surekha"));
		ts.add(new User("Abi"));
		
		for (User u: ts){
			System.out.println(u);
		}
	}

}

class User implements Comparable<User>{
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username) {
		super();
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}

	@Override
	public int compareTo(User u) {
		// TODO Auto-generated method stub
		return this.username.compareTo(u.username);
	}
	
}