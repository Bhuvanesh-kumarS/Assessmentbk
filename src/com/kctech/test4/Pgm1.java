package com.kctech.test4;
	import java.util.Arrays;

	class Pgm1 {
		public static void main(String args[])
	    {
	        String firstWords[] = { "cinema", "host", "aba", "train" };
	        String secondWords[] = { "iceman", "shot", "bab","rain"};
	        for (int i = 0; i < firstWords.length; i++) {
	            char[] s0 = firstWords[i].toCharArray();
	            char[] s1 = secondWords[i].toCharArray();
	            Arrays.sort(s0);
	            Arrays.sort(s1);
	            if (Arrays.equals(s0, s1))
	                System.out.println("1");
	            else
	                System.out.println("0");
	        }
	    }
	}


