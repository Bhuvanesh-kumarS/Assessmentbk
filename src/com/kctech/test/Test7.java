package com.kctech.test;

	import java.io.*;
	import java.util.Arrays;
	import java.util.Collections;
	 
	class Test7 {
	 
	    static boolean areAnagram(String[] str1, String[] str2)
	    {
	        int s1 = str1.length;
	        int s2 = str2.length;
	        if (s1 != s2)
	            return false;
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	        for (int i = 0; i < s1; i++)
	            if (str1[i] != str2[i])
	                return false;
	 
	        return true;
	    }

	    public static void main(String args[])
	    {
	        String str1[] = { "SAVE" };
	        String str2[] = { "VASE" };
	        if (areAnagram( str1, str2))
	            System.out.println("The two strings are"
	                               + " anagram of each other");
	        else
	            System.out.println("The two strings are not"
	                               + " anagram of each other");
	    }
	}


