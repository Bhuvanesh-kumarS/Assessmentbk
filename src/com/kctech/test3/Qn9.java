package com.kctech.test3;

	import java.util.*; 
	  
	public class Qn9 { 
	    public static void main(String[] args) 
	    { 
	        HashMap<String, Integer> map 
	            = new HashMap<>();  
	        map.put("vishal", 10); 
	        map.put("sachin", 30); 
	        map.put("vaibhav", 20);
	        Set<String> keySet = map.keySet(); 
	        ArrayList<String> listOfKeys 
	            = new ArrayList<String>(keySet); 
	        Collection<Integer> values = map.values(); 
	        ArrayList<Integer> listOfValues 
	            = new ArrayList<>(values); 
	  
	        System.out.println("The Keys of the Map are "
	                           + listOfKeys); 
	  
	        System.out.println("The Values of the Map are "
	                           + listOfValues); 
	    } 
	} 


