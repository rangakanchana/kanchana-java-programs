package com.strings;

import java.util.HashSet;
import java.util.Set;

public class OverrideEqandHashEx {
	//creating two objects of Employee class
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setId(25);
		e2.setId(25);
		System.out.println(e1.equals(e2));   //false---after overriding equals()---true

		//HashSet doesnot allow duplicates
		
	    Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		System.out.println(e1.hashCode());//prints two objects hence when we override equals()
		System.out.println(e2.hashCode());//we must override hashcode() too;		
	   System.out.println(employees);
	   for(Employee e: employees){
		System.out.println(e.getId());   
		   
	   }
		
		
		
	}

}
