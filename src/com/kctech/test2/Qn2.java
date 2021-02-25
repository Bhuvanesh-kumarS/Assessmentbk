package com.kctech.test2;

	interface MyInterface{
		   public void test();
		   public static void display() {
		      System.out.println("This is a static method");
		   }
		}
		public class Qn2{
		   public void test() {
		      System.out.println("This is the implementation of the test method");
		   }
		   public static void main(String args[])
		   {
		      Qn2 obj = new Qn2();
		      obj.test();
		      MyInterface.display();
		   }
		}

