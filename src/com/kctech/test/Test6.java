package com.kctech.test;

public class Test6 {
	public class Foo 
	{ public Foo()
	{ doSomething();
	}
	public void doSomething()
	{ System.out.println("do something acceptable");
	} } 
	public class Bar extends Foo
	{ 
		public void doSomething()
	{ 
	System.out.println("yolo");
	//Zoom zoom = new Zoom(this);
	}
	}
}
