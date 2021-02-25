package com.kctech.test2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Qn4 {

	public static void main(String[] args) 
	{
		List<Integer> ints = Stream.of(5 , 3 , 4 , 55 , 2 ,22,123,545,33,242).collect(Collectors.toList());
	    Integer maxInt = ints.stream()
	                              .max(Comparator.comparing(i -> i))
	                              .get();

	    System.out.println("Maximum number in the set is " + maxInt);

	}

}
