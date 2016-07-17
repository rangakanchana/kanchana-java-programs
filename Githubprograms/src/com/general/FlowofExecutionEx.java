package com.general;

public class FlowofExecutionEx {
	int a = 10;  //    local variable
	static int b = 20;   //static variable
	
	static void m1(String str){             //static method
		System.out.println("Static method");
	}
	public void m2(int a){                       //instance method
		System.out.println("instance method");
	}
	{
		System.out.println("instance block");    //instance block
	}
	static{
		System.out.println("static block");
		System.out.println(FlowofExecutionEx.b);  //static block
	}
	public FlowofExecutionEx(int a){           //parameterised constructor
	System.out.println("parameterised constructor");
    }
	public static void main(String[] args) {
		FlowofExecutionEx obj = new FlowofExecutionEx(5);
		FlowofExecutionEx.m1("hello");
		obj.m2(6);
}

}
