package com.n2s.collections;

import java.util.HashSet;
import java.util.Set;

public class HashEquals {
	private long id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashEquals h1 = new HashEquals();
		HashEquals h2 = new HashEquals();
		
		h1.setId(100);
		h2.setId(100);
		
		System.out.println(h1.equals(h2));
		Set<HashEquals> test = new HashSet<HashEquals>();
		
		test.add(h1);
		test.add(h2);
		System.out.println(test);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashEquals other = (HashEquals) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
