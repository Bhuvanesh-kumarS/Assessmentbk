package com.kctech.test;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
	public static void main(String args[])
	{
	final List list = new ArrayList<>(); 
	list.add(1); 
	list.add(2); 
	list.add(3); 
	list.remove(2); 
	System.out.println(list);
	
}
}