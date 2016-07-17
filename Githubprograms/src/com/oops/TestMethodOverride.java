package com.oops;

public class TestMethodOverride {

	public static void main(String[] args) {

		BaseClass obj1 = new BaseClass();
		ChildClass obj2 = new ChildClass();
		BaseClass obj3 = new ChildClass();
		
		obj1.methodToOverride();
		obj2.methodToOverride();
		obj3.methodToOverride();
		
		
		
	}

}
