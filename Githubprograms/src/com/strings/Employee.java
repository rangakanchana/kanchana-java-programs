package com.strings;

public class Employee {
	private int id;     //becoz of private we cnnot use this variable,so we use getters and setters method
	private String name;
	
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	//override equals method
	public boolean equals(Object o){
		if(o==null){
			return false;
		}if(o==this){
			return true;
		}
		if(getClass()!=o.getClass()){
			return false;
		}
		Employee e=(Employee)o;
		return (this.getId()==e.getId());
		}
	//override hashode method
	public int hashCode(){
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + getId();
		return result;
	}
	
	}


