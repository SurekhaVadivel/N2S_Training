package com.n2s.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> nums = Stream.of(1,2,3,4,5);
		Optional<Integer> op = nums.reduce((i, j) -> {
			return 	i * j;
		});
		if(op.isPresent()){
			System.out.println(op.get());
		}

		//once pipeline is processed, we cant access the Stream again, it will throw error
		System.out.println(nums.count());
	}

}
